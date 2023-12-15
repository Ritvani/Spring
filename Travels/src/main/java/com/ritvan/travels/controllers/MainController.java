package com.ritvan.travels.controllers;

import com.ritvan.travels.models.Expenses;
import com.ritvan.travels.services.ExpenseService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private ExpenseService expenseService;

    @GetMapping("/")
    public String rootpath(){
        return "redirect:/expenses";
    }

    @GetMapping("/expenses")
    public String home(@ModelAttribute("expense")Expenses expense, Model model){
        List<Expenses>expenses=expenseService.getAllExpenses();
        model.addAttribute("expenses", expenses);
        return "index";
    }

    @PostMapping("/create/expense")
    public String newExpense(@Valid @ModelAttribute("expense")Expenses expense, BindingResult result, Model model){
        if(result.hasErrors()){
            List<Expenses> expenses=expenseService.getAllExpenses();
            model.addAttribute("expenses", expenses);
            return "index";
            //Or replace the three lines of code above(List.... index) with: return "redirect:/expenses"//
        }else{
            expenseService.createExpense(expense);
            return "redirect:/expenses";
        }
    }

    @GetMapping("/expenses/update/{id}")
    public String editExpense(@PathVariable("id") Long id, Model model){
        model.addAttribute("expense", expenseService.findExpense(id));
        return "edit";
    }

    @PutMapping("/expenses/edit/{id}")
    public String updateExpense(@PathVariable("id") Long id, Model model, @Valid @ModelAttribute("expense") Expenses expense, BindingResult result){
        if(result.hasErrors()){
            return "redirect:/expenses/update/{id}";
        } else{
            expenseService.updateExpense(expense);
            return "redirect:/expenses";
        }
    }

    @RequestMapping("/expenses/delete/{id}")
    public String deleteExpense(@PathVariable("id") Long id){
        Expenses expense=expenseService.findExpense(id);
        expenseService.deleteExpense(expense);
        return "redirect:/expenses";
    }

    @GetMapping("/details/{id}")
    public String expenseDetails(@PathVariable("id") Long id, Model model){
        model.addAttribute("expense", expenseService.findExpense(id));
        return "details";
    }
}
