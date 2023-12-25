package com.ritvan.bookclub.controllers;

import com.ritvan.bookclub.models.Book;
import com.ritvan.bookclub.models.LoginUser;
import com.ritvan.bookclub.models.User;
import com.ritvan.bookclub.services.BookService;
import com.ritvan.bookclub.services.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public String index(Model model, @ModelAttribute("newUser") User newUser, @ModelAttribute("newLogin") User newLogin, HttpSession session){
        Long loggedInUserID = (Long) session.getAttribute("loggedInUserID");

        if (loggedInUserID !=null){
            return "redirect:/dashboard";
        }

        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "index";
    }

    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model, HttpSession session) {
        userService.register(newUser, result);

        if(result.hasErrors()) {
            model.addAttribute("newLogin", new LoginUser());
            return "index";
        }
        session.setAttribute("loggedInUserID", newUser.getId());
        return "redirect:/dashboard";
    }

    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult result, Model model, HttpSession session) {
        User user = userService.login(newLogin, result);

        if(result.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "index";
        }
        session.setAttribute("loggedInUserID", user.getId());
        return "redirect:/dashboard";
    }

    @RequestMapping("/dashboard")
    public String dashboard(HttpSession session, Model model){
        Long loggedInUserID = (Long) session.getAttribute("loggedInUserID");

        if (loggedInUserID == null){
            return "redirect:/";
        }

        User loggedInUser = userService.findOneUser(loggedInUserID);
        model.addAttribute("user", loggedInUser);
        model.addAttribute("books", bookService.allBooks());

        return "dashboard";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }

    @GetMapping("/new/book")
    public String newBook(@ModelAttribute ("book")Book book, Model model, HttpSession session){
        User user = userService.findOneUser((Long)session.getAttribute("loggedInUserID"));
        model.addAttribute("user", user);

        return "new";
    }

    @PostMapping("/create/book")
    public String createBook(@Valid @ModelAttribute("book") Book book, BindingResult result, Model model, HttpSession session){
        if (result.hasErrors()){
            User user = userService.findOneUser((Long) session.getAttribute("loggedInUserID"));
            model.addAttribute("user", user);
            return "new";
        }else {
            User user = userService.findOneUser((Long) session.getAttribute("loggedInUserID"));
            book.setUser(user);
            bookService.create(book);

            return "redirect:/dashboard";
        }
    }

    @GetMapping("/books/{id}")
    public String bookDetails(@PathVariable("id") Long id, Model model, HttpSession session){
        Long loggedInUserID = (Long) session.getAttribute("loggedInUserID");

        if (loggedInUserID ==null){
            return "redirect:/";
        }
        Book book = bookService.findBook(id);
        model.addAttribute("book", book);
        model.addAttribute("user", userService.findOneUser((Long) session.getAttribute("loggedInUserID")));

        return "details";
    }

    @GetMapping("/books/{id}/edit")
    public String editBook(@PathVariable("id") Long id, Model model, HttpSession session){
        Long loggedInUserID = (Long) session.getAttribute("loggedInUserID");

        if (loggedInUserID ==null){
            return "redirect:/";
        }
        Book editBook = bookService.findBook(id);
        model.addAttribute("editBook", editBook);

        return "edit";
    }

    @PostMapping("/books/{id}/update")
    public String updateBook(@Valid @ModelAttribute("editBook") Book editBook, BindingResult result, Model model, @PathVariable("id") Long id, HttpSession session){
        if (result.hasErrors()){
            return "edit";
        }else{
            User user = userService.findOneUser((Long) session.getAttribute("loggedInUserID"));
            editBook.setUser(user);
            bookService.update(editBook);

            return "redirect:/dashboard";
        }
    }

    @PostMapping("/books/{id}/delete")
    public String deleteBook(@PathVariable("id") Long id, HttpSession session){
        Long loggedInUserID = (Long) session.getAttribute("loggedInUserID");

        if (loggedInUserID ==null){
            return "redirect:/";
        }
        bookService.deleteBook(id);
        return "redirect:/dashboard";
    }
}