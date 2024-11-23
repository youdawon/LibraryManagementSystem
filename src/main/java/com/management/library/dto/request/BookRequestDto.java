package com.management.library.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookRequestDto {

  @NotBlank(message = "Book title is required.")
  @Schema(description = "Title of the book", example = "Effective Java")
  private String title;

  @NotBlank(message = "Author name is required.")
  @Schema(description = "Name of the author", example = "Joshua Bloch")
  private String author;

  @Pattern(regexp = "\\d{13}", message = "ISBN number must be 13 digits.")
  @Schema(description = "ISBN number of the book", example = "1238432667123")
  private String isbn;

  @Schema(description = "Publication date of the book", example = "2018-12-13")
  private String publishedDate;

  @NotNull(message = "Book price is required.")
  @Positive(message = "Price must be a positive value.")
  @Schema(description = "Price of the book", example = "45.99")
  private Double price;

  @NotNull(message = "Stock quantity is required.")
  @Positive(message = "Stock quantity must be a positive value.")
  @Schema(description = "Number of books in stock", example = "10")
  private Integer stock;
}