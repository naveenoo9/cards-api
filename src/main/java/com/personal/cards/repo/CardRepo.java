package com.personal.cards.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personal.cards.entities.CreditCard;

@Repository
public interface CardRepo extends JpaRepository<CreditCard, Long> {
  
}
