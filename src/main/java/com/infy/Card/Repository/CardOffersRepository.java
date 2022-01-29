package com.infy.Card.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.Card.Domain.CardOffers;

public interface CardOffersRepository extends JpaRepository<CardOffers, Integer> {
	public CardOffers findBySimId(int simid);
}
