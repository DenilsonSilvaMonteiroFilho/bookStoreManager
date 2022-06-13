package com.denilsonf.bookstoremaneger.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*FICAR DE OLHO NOS POSIVEIS ERROS DO NULLABLE = FALSE 
    * COMO JA OCORREU ANTERIOR MENTE
    */
    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private Integer age;
}