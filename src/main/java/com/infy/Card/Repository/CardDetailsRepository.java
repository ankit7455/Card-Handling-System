package com.infy.Card.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infy.Card.Domain.CardDetails;

@Repository
public interface CardDetailsRepository extends JpaRepository<CardDetails, Integer>{
	
	@Query("select s from SimDetails s where s.simNumber=?1 and s.serviceNumber=?2")
	public CardDetails findBySimNumerAndServiceNumber(String simnumber,String servicenumber);
	@Transactional
	   @Modifying
	@Query(value = "update SimDetails set simStatus=?1 where simId=?2")
	public void updateSimStatus(String status,int simid);
	
}
