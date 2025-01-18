package com.personal.cards.exceptions;

public class CardDetailsException extends RuntimeException {
  public CardDetailsException(String message) {
    super(message);
  }
  public CardDetailsException(String message, Throwable cause) {
    super(message, cause);
  }
}
