package com.personal.cards.exceptions.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.personal.cards.exceptions.InvalidCardException;
import com.personal.cards.exceptions.UnrecoverableCardException;
import com.personal.cards.model.ErrorDTO;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@ControllerAdvice  @Slf4j
public class GlobalExceptionHandler {
  
  @ExceptionHandler(exception = InvalidCardException.class)
  public ResponseEntity<ErrorDTO> handleInvalidCardException(InvalidCardException exception,
      HttpServletRequest request) {
    ErrorDTO error = new ErrorDTO(exception.getErrorCode(), exception.getMessage(), request.getRequestURI());
    log.error(exception.getStackTrace()[0].toString());
    log.error(error.toString());
    return ResponseEntity.status(error.getStatusCode()).body(error);
  }
  
  @ExceptionHandler(exception = UnrecoverableCardException.class)
  public ResponseEntity<ErrorDTO> handleUnrecoverableCardException(UnrecoverableCardException exception, HttpServletRequest request) {
    ErrorDTO error = new ErrorDTO(exception.getErrorCode(), exception.getMessage(), request.getRequestURI());
    log.error(error.toString());
    return ResponseEntity.status(error.getStatusCode()).body(error);
  }
}
