package com.denilsonf.bookstoremaneger.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.denilsonf.bookstoremaneger.dto.BookDTO;
import com.denilsonf.bookstoremaneger.entity.Book;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);
    
    Book toModel(BookDTO bookDTO);

    BookDTO toDTO(Book book);
}
