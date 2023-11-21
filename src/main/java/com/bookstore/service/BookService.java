package com.bookstore.service;

import com.bookstore.dto.book.BookDto;
import com.bookstore.dto.book.BookSearchParameters;
import com.bookstore.dto.book.CreateBookRequestDto;
import java.util.List;
import org.springframework.data.domain.Pageable;

public interface BookService {
    BookDto save(CreateBookRequestDto bookDto);

    BookDto updateById(Long id,CreateBookRequestDto bookDto);

    BookDto findBookById(Long id);

    List<BookDto> findAll(Pageable pageable);

    void deleteById(Long id);

    List<BookDto> search(BookSearchParameters params);
}
