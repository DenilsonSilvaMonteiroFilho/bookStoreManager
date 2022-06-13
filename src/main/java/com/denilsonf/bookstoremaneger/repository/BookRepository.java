package com.denilsonf.bookstoremaneger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.denilsonf.bookstoremaneger.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
    
}
