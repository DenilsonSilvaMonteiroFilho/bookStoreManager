package com.denilsonf.bookstoremaneger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.denilsonf.bookstoremaneger.dto.BookDTO;
import com.denilsonf.bookstoremaneger.dto.MessageResponseDTO;
import com.denilsonf.bookstoremaneger.entity.Book;
import com.denilsonf.bookstoremaneger.mapper.BookMapper;
import com.denilsonf.bookstoremaneger.repository.BookRepository;

@Service
public class BookService {

    private BookRepository bookRepository;

    private final BookMapper bookMapper = BookMapper.INSTANCE;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(BookDTO bookDTO){
        Book bookToSave = bookMapper.toModel(bookDTO);
        Book savedBook = bookRepository.save(bookToSave);
        return MessageResponseDTO.builder()
                .message("Book created with ID " + savedBook.getId())
                .build();
    }
}
