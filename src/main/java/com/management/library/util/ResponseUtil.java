package com.management.library.util;

import com.management.library.dto.response.CommonResponseDto;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

public class ResponseUtil {

  public static<T> ResponseEntity<CommonResponseDto<T>> success(T data){
    return ResponseEntity.ok(CommonResponseDto.<T>builder()
        .data(data)
        .build());
  }

  public static<T> ResponseEntity<CommonResponseDto<T>> fail(HttpStatusCode httpStatusCode, T data){
    return ResponseEntity.status(httpStatusCode)
        .body(CommonResponseDto.<T>builder()
            .data(null)
            .build());
  }
}