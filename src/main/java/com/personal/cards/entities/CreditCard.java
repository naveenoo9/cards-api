package com.personal.cards.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor @Getter @Setter @ToString
public class CreditCard extends Card {
  private Long usedCredit;
  private Long avaiableCredit;
}
