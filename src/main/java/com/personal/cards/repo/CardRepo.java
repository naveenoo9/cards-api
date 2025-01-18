package com.personal.cards.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personal.cards.entities.Card;

@Repository
public interface CardRepo extends JpaRepository<Card, Long> {
  Optional<Card> findByCardNumber(String cardNumber);
}
