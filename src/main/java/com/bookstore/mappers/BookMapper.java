package com.bookstore.mappers;

import com.bookstore.dto.book.BookDto;
import com.bookstore.dto.book.CreateBookRequestDto;
import com.bookstore.model.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {
    Book mapToModel(CreateBookRequestDto requestDto);

    BookDto mapToDto(Book book);
}
