package com.bookstore.repository;

import com.bookstore.dto.BookSearchParameters;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
public interface SpecificationBuilder<T> {
    Specification<T> build(BookSearchParameters bookSearchParameters);
}
