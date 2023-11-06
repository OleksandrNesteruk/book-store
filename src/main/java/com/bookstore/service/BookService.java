package com.bookstore.service;

import com.bookstore.dto.BookDto;
import com.bookstore.dto.CreateBookRequestDto;
import java.util.List;

public interface BookService {
    BookDto save(CreateBookRequestDto bookDto);

    BookDto updateById(Long id,CreateBookRequestDto bookDto);

    BookDto findBookById(Long id);

    List<BookDto> findAll();

    void deleteById(Long id);
}
