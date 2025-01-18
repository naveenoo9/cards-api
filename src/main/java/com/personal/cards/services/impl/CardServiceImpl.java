package com.personal.cards.services.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.cards.entities.Card;
import com.personal.cards.exceptions.CardDetailsException;
import com.personal.cards.repo.CardRepo;
import com.personal.cards.services.CardService;

@Service
public class CardServiceImpl implements CardService {

  @Autowired
  private CardRepo cardRepo;
  private static final Logger log = LoggerFactory.getLogger(CardServiceImpl.class);

  @Override
  public Card addNewCard(Card newCard) {
    log.info("Adding new Card ", newCard);
    if (newCard == null) 
      throw new CardDetailsException("Card details cannot be empty");
    Card savedCard = cardRepo.save(newCard);
    log.info("Added Card", savedCard);
    return savedCard;
  }

  @Override
  public List<Card> getAllCards() {
    log.info("Fetching all Cards");
    List<Card> cards = cardRepo.findAll();
    if (cards.size() == 0)
      throw new CardDetailsException("Found 0 cards");
    log.info("Found {} cards", cards.size());
    return cards;
  }

  @Override
  public Card getCardById(Long cardId) {
    log.info("Fetch Card with ID: ", cardId);
    Optional<Card> optional = cardRepo.findById(cardId);
    if (optional.isEmpty())
      throw new CardDetailsException("No Card found with ID: " + cardId);
    return optional.get();
  }

  @Override
  public Card getCardByNumber(String cardNumber) {
    log.info("Fetching card for ", cardNumber);
    Optional<Card> optional = cardRepo.findByCardNumber(cardNumber);
    if (optional.isEmpty())
      throw new CardDetailsException("No Card found for: " + cardNumber);
    return optional.get();
  }
  
}
