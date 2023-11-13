package com.bookstore.repository.book;

import com.bookstore.dto.BookSearchParameters;
import com.bookstore.model.Book;
import com.bookstore.repository.SpecificationBuilder;
import com.bookstore.repository.SpecificationProviderManager;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookSpecificationBuilder implements SpecificationBuilder<Book> {
    private final SpecificationProviderManager<Book> specificationProviderManager;

    @Override
    public Specification<Book> build(BookSearchParameters searchParameters) {
        Specification<Book> spec = Specification.where(null);
        if (searchParameters.author() != null && searchParameters.author().length > 0) {
            spec = spec.and(specificationProviderManager.getSpecificationProvider("author")
                    .getSpecification(searchParameters.author()));
        }
        if (searchParameters.title() != null && searchParameters.title().length > 0) {
            spec = spec.and((specificationProviderManager.getSpecificationProvider("title")
                    .getSpecification(searchParameters.title())));
        }
        if (searchParameters.isbn() != null && searchParameters.isbn().length > 0) {
            spec = spec.and((specificationProviderManager.getSpecificationProvider("isbn")
                    .getSpecification(searchParameters.isbn())));
        }
        if (searchParameters.price() != null && searchParameters.price().length > 0) {
            spec = spec.and((specificationProviderManager.getSpecificationProvider("price")
                    .getSpecification(searchParameters.price())));
        }
        return spec;
    }
}
