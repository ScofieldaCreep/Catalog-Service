package com.polarbookshop.catalogservice.domain;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

public record Book (
    @NotBlank(message = "The book isbn must be defined")
    @Pattern(regexp = "(^[0-9]{10}|^[0-9]{13})$", message = "The isbn format must be valid")
    String isbn,

    @NotBlank(message = "The book's title must not be blank")
    String title,

    @NotBlank(message = "The book's author must not be blank")
    String author,

    @NotNull(message = "Price must be defined")
    @Positive(message = "Price must be positive")
    Double price
){}
