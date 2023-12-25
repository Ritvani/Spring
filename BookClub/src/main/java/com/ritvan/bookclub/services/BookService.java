package com.ritvan.bookclub.services;

import com.ritvan.bookclub.models.Book;
import com.ritvan.bookclub.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book create(Book book){
        return bookRepository.save(book);
    }

    public List<Book>allBooks(){
        return bookRepository.findAll();
    }

    public Book findBook(Long id){
        return bookRepository.findById(id).orElse(null);
    }

    public Book update(Book book){
        return bookRepository.save(book);
    }

    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }
}
