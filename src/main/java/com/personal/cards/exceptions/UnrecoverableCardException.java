package com.personal.cards.exceptions;

import lombok.Getter;

@Getter
public class UnrecoverableCardException extends RuntimeException {
  private int errorCode;
  public UnrecoverableCardException(String message, int errorCode) {
    super(message);
    this.errorCode = errorCode;
  }
}
