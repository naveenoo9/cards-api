package com.personal.cards.services;

import java.util.List;

import com.personal.cards.entities.Card;

public interface CardService {
  Card addNewCard(Card newCard);

  List<Card> getAllCards();

  Card getCardById(Long cardId);

  Card getCardByNumber(String cardNumber);
}
