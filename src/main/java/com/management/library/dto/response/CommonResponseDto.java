package com.management.library.dto.response;

import lombok.Builder;

@Builder
public class CommonResponseDto<T> {

  private String resultCode;
  private String resultMsg;
  private T data;
}
