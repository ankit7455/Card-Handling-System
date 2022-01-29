package com.infy.Card.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.Card.Domain.CardDetails;
import com.infy.Card.Domain.CardOffers;
import com.infy.Card.Repository.CardDetailsRepository;
import com.infy.Card.Repository.CardOffersRepository;

@Service
public class CardDetailsServicesImpl implements CardDetailsServices{

	@Autowired
	public CardDetailsRepository cardDetailsRepository;
	@Autowired
	public CardOffersRepository cardOffersRepository;
	@Override
	public CardDetails verificationservice(String simnumber, String servicenumber)
	{
		return cardDetailsRepository.findBySimNumerAndServiceNumber(simnumber, servicenumber);	
	}

	@Override
	public CardOffers getSimOfferDetails(int simid) {
		return  cardOffersRepository.findBySimId(simid);
	}
	
}
