package com.denilsonf.bookstoremaneger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.denilsonf.bookstoremaneger.dto.MessageResponseDTO;
import com.denilsonf.bookstoremaneger.entity.Book;
import com.denilsonf.bookstoremaneger.repository.BookRepository;;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    
    private BookRepository BookRepository;

    @Autowired
    public BookController(BookRepository bookRepository){
        this.BookRepository = bookRepository;
    }
    
    @PostMapping
    public MessageResponseDTO create(@RequestBody Book book){
        Book savedBook = BookRepository.save(book);
        return MessageResponseDTO.builder()
                .message("Book created with ID " + savedBook.getId() + " " + book.getIsbn())
                .build();
    }
}
