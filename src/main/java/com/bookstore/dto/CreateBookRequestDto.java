package com.bookstore.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateBookRequestDto {
    @NotEmpty
    @Size(max = 40)
    private String title;
    @NotEmpty
    @Size(max = 40)
    private String author;
    @NotNull
    @Size(min = 6)
    private String isbn;
    @NotNull
    @Min(0)
    private BigDecimal price;
    @Size(max = 100)
    private String description;
    private String coverImage;
}
