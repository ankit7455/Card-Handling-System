package com.infy.Card.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.Card.Domain.CardDetails;
@Repository
public interface GetSimStatusRepository extends JpaRepository<CardDetails, Integer>{
	
	public CardDetails findBySimId(int simid);
}
