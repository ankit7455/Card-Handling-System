package com.infy.Card.Services;

import org.springframework.stereotype.Service;

import com.infy.Card.Domain.CardDetails;
import com.infy.Card.Domain.CardOffers;
@Service
public interface CardDetailsServices {	
	
	public CardDetails verificationservice(String simnumber, String servicenumber);
	public CardOffers getSimOfferDetails(int simid);
}
