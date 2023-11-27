package com.example.bookstoremanager.mapper;

import com.example.bookstoremanager.dto.BookDTO;
import com.example.bookstoremanager.entity.Book;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);
    Book toModel(BookDTO bookDTO);
    BookDTO toDTO(Book book);
}
