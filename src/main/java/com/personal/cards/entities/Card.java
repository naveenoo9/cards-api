package com.personal.cards.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cards") @NoArgsConstructor
public class Card {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "card_id")
  private Long cardId;
  @Column(name = "card_number")
  private String cardNumber;
  @Column(name = "expiry_date")
  private String expDate;
  @Column(name = "card_cvv")
  private Long cardCvv;
  @Column(name = "holder_name")
  private String cardHldrName;
  @Column(name = "card_name")
  private String cardName;
  /**
   * @param cardNumber
   * @param expDate
   * @param cardCvv
   * @param cardHldrName
   * @param cardName
   */
  public Card(String cardNumber, String expDate, Long cardCvv, String cardHldrName, String cardName) {
    this.cardNumber = cardNumber;
    this.expDate = expDate;
    this.cardCvv = cardCvv;
    this.cardHldrName = cardHldrName;
    this.cardName = cardName;
  }
  /**
   * @return the cardId
   */
  public Long getCardId() {
    return cardId;
  }
  /**
   * @return the cardNumber
   */
  public String getCardNumber() {
    return cardNumber;
  }
  /**
   * @param cardNumber the cardNumber to set
   */
  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }
  /**
   * @return the expDate
   */
  public String getExpDate() {
    return expDate;
  }
  /**
   * @param expDate the expDate to set
   */
  public void setExpDate(String expDate) {
    this.expDate = expDate;
  }
  /**
   * @return the cardCvv
   */
  public Long getCardCvv() {
    return cardCvv;
  }
  /**
   * @param cardCvv the cardCvv to set
   */
  public void setCardCvv(Long cardCvv) {
    this.cardCvv = cardCvv;
  }
  /**
   * @return the cardHldrName
   */
  public String getCardHldrName() {
    return cardHldrName;
  }
  /**
   * @param cardHldrName the cardHldrName to set
   */
  public void setCardHldrName(String cardHldrName) {
    this.cardHldrName = cardHldrName;
  }
  /**
   * @return the cardName
   */
  public String getCardName() {
    return cardName;
  }
  /**
   * @param cardName the cardName to set
   */
  public void setCardName(String cardName) {
    this.cardName = cardName;
  }
  @Override
  public String toString() {
    return "Card [cardId=" + cardId + ", cardNumber=" + cardNumber + ", expDate=" + expDate + ", cardCvv=" + cardCvv
        + ", cardHldrName=" + cardHldrName + ", cardName=" + cardName + "]";
  }  
}
