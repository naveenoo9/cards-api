package com.personal.cards.exceptions;

import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class InvalidCardException extends RuntimeException {
  private int errorCode;
  public InvalidCardException(String message, int errorCode) {
    super(message);
    this.errorCode = errorCode;
  }
}
