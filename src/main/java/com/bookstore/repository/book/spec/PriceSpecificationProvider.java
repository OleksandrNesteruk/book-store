package com.bookstore.repository.book.spec;

import com.bookstore.model.Book;
import com.bookstore.repository.SpecificationProvider;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
public class PriceSpecificationProvider implements SpecificationProvider<Book> {
    private static final String FIELD_NAME = "price";

    @Override
    public String getKey() {
        return "price";
    }

    @Override
    public Specification<Book> getSpecification(String[] params) {
        return (root, query, criteriaBuilder) -> {
            Predicate predicate;
            if (params.length > 1) {
                predicate = criteriaBuilder.between(root.get(FIELD_NAME), params[0], params[1]);
            } else {
                predicate = criteriaBuilder.greaterThanOrEqualTo(root.get(FIELD_NAME), params[0]);
            }
            return predicate;
        };
    }
}
