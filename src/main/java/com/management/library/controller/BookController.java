package com.management.library.controller;

import com.management.library.dto.request.BookRequestDto;
import com.management.library.dto.response.CommonResponseDto;
import com.management.library.util.ResponseUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
@Tag(name = "Book Management API", description = "APIs for managing books")
public class BookController {

  @Operation(summary = "Retrieve all books", description = "Retrieve all books")
  @GetMapping
  public ResponseEntity<CommonResponseDto<Void>> getAllBooks(){

    return ResponseUtil.success(null);
  }

  @Operation(summary = "Retrieve a book", description = "Retrieve a book")
  @GetMapping("/{id}")
  public ResponseEntity<CommonResponseDto<Void>> getBookById(@PathVariable Long id){
    return ResponseUtil.success(null);
  }

  @Operation(summary = "AddBook a new book", description = "addBook a new book the collection")
  @PostMapping
  public ResponseEntity<CommonResponseDto<Void>> addBook(@RequestBody BookRequestDto bookRequestDto){

    return ResponseUtil.success(null);
  }

  @Operation(summary = "Update a book", description = "update details of an existing book by its ID")
  @PutMapping("/{id}")
  public ResponseEntity<CommonResponseDto<Void>> updateBook(@PathVariable Long id, @RequestBody BookRequestDto bookRequestDto){
    return ResponseUtil.success(null);
  }

  @Operation(summary = "Delete a book", description = "Delete a book by its ID")
  @DeleteMapping
  public ResponseEntity<CommonResponseDto<Void>> deleteBook(@PathVariable Long id){
    return ResponseUtil.success(null);
  }
}
