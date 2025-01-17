package com.personal.cards.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cards")
public class CreditCard {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "card_id")
  private Long cardId;
  @Column(name = "holder_name")
  private String cardHolderName;
  @Column(name = "card_number")
  private String cardNumber;
  @Column(name = "expiry_date")
  private String expDate;
  @Column(name = "lender")
  private String lender;
  @Column(name = "limit")
  private Long limit;
  @Column(name = "available_limit")
  private Long avlbleLimit;
}
