package com.personal.cards.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personal.cards.entities.Card;

@Repository
public interface CardsRepository extends JpaRepository<Card, Long>{
  
}
