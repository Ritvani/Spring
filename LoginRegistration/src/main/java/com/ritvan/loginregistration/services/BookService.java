package com.ritvan.loginregistration.services;

import com.ritvan.loginregistration.models.Book;
import com.ritvan.loginregistration.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book create(Book book){
        return bookRepository.save(book);
    }
}
