package com.management.library.controller;

import com.management.library.dto.response.CommonResponseDto;
import com.management.library.dto.request.MemberRequestDto;
import com.management.library.util.ResponseUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@Tag(name="Member API", description = "APIs for member registration and authentication")
public class AuthController {

  @Operation(summary = "Register a new member", description = "Register a new member by providing necessary details.")
  @PostMapping("/register")
  public ResponseEntity<CommonResponseDto<Void>> register(@RequestBody MemberRequestDto memberRequestDto){
    return ResponseUtil.success(null);
  }

  @Operation(summary = "Login", description = "Authenticate a user by providing login credentials.")
  @PostMapping("/login")
  public ResponseEntity<CommonResponseDto<Void>> login(@RequestBody MemberRequestDto memberRequestDto){
    return ResponseUtil.success(null);
  }
}
