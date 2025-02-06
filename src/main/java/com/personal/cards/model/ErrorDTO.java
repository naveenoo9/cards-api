package com.personal.cards.model;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.ToString;

@Data @ToString
public class ErrorDTO {
  private int statusCode;
  private String message;
  private String path;
  // private String cause;
  private LocalDateTime timestamp;

  public ErrorDTO(int statusCode, String message, String path) {
    this.statusCode = statusCode;
    this.message = message;
    this.path = path;
    // this.cause = cause;
    this.timestamp = LocalDateTime.now();
  }
}
