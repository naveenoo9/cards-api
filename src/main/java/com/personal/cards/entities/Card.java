package com.personal.cards.entities;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "cards")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@JsonTypeInfo(property = "cardType", include = JsonTypeInfo.As.PROPERTY, use = JsonTypeInfo.Id.NAME)
@JsonSubTypes({
  @JsonSubTypes.Type(name = "debit", value = DebitCard.class),
  @JsonSubTypes.Type(name = "credit", value = CreditCard.class)
})
@NoArgsConstructor @Getter @Setter @ToString
public abstract class Card {
  @Id @GeneratedValue(strategy = GenerationType.AUTO)
  private Long cardId;
  private String holderName;
  private String cardNumber;
  private String cardName;
  private Long cvv;
  private String expiryDate;
}
