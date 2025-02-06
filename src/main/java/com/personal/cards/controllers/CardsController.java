package com.personal.cards.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personal.cards.entities.Card;
import com.personal.cards.services.CardService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping(path="/cards/v1")
public class CardsController {

  private @Autowired CardService cardService;
  // private final static Logger log = LoggerFactory.getLogger(CardsController.class);
  
  @GetMapping(path = "/hello")
  public String hello() {
    return "Hello!";
  }

  @GetMapping
  @Operation(description = "List all Cards")
  @ApiResponses(value = {
  @ApiResponse(responseCode="200",  description = "Retrieve a list of cards",
          content = @Content(mediaType = "application/json", schema = @Schema(implementation = Card.class))),
    @ApiResponse(responseCode = "404", description = "No Cards found"),
    @ApiResponse(responseCode = "400", description = "Invalid input"),
    @ApiResponse(responseCode = "500", description = "Server Error")
  })
  public ResponseEntity<List<Card>> fetchAllCards() {
    return ResponseEntity.ok().body(cardService.getAllCards());
  }

  @PostMapping
  public ResponseEntity<Card> createNewCard(@RequestBody Card newCard) {
    Card savedCard = cardService.addNewCard(newCard);
    return ResponseEntity.status(HttpStatus.CREATED).body(savedCard);
  }

  // @GetMapping(path = "/card/{cardNumber}")
  // public ResponseEntity<Card> fetchCardByCardNumber(@PathVariable String cardNumber) {
  //   return ResponseEntity.ok().body(cardService.getCardByNumber(cardNumber));
  // }
}
