package com.management.library.controller;

import com.management.library.dto.request.RentalRequestDto;
import com.management.library.dto.response.CommonResponseDto;
import com.management.library.util.ResponseUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rentals")
@Tag(name = "Book Rental API", description = "APIs for renting and returning books")
public class RentalController {

  @Operation(summary = "Rent a book", description = "Rent a book by providing the necessary rental details.")
  @PostMapping
  public ResponseEntity<CommonResponseDto<Void>> rentBook(@RequestBody RentalRequestDto rentalRequestDto){

    return ResponseUtil.success(null);
  }

  @Operation(summary = "Return a book", description = "Return a rented book by its unique identifier (ID).")
  @PutMapping("/{id}")
  public ResponseEntity<CommonResponseDto<Void>> returnBook(@PathVariable Long id){
    return ResponseUtil.success(null);
  }
}
