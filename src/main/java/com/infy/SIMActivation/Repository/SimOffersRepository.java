package com.infy.SIMActivation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.SIMActivation.Domain.SimOffers;

public interface SimOffersRepository extends JpaRepository<SimOffers, Integer> {
	public SimOffers findBySimId(int simid);
}
