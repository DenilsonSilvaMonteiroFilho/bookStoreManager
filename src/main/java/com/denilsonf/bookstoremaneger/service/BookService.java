package com.denilsonf.bookstoremaneger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.denilsonf.bookstoremaneger.dto.MessageResponseDTO;
import com.denilsonf.bookstoremaneger.entity.Book;
import com.denilsonf.bookstoremaneger.repository.BookRepository;

@Service
public class BookService {
    
    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(Book book){
        Book savedBook = bookRepository.save(book);
        return MessageResponseDTO.builder()
                .message("Book created with ID " + savedBook.getId() + " " + book.getIsbn())
                .build();
    }
}
