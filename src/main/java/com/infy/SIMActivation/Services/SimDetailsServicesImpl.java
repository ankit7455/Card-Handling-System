package com.infy.SIMActivation.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.SIMActivation.Domain.SimDetails;
import com.infy.SIMActivation.Domain.SimOffers;
import com.infy.SIMActivation.Repository.SimDetailsRepository;
import com.infy.SIMActivation.Repository.SimOffersRepository;

@Service
public class SimDetailsServicesImpl implements SimDetailsServices{

	@Autowired
	public SimDetailsRepository simDetailsRepository;
	@Autowired
	public SimOffersRepository simOffersRepository;
	@Override
	public SimDetails verificationservice(String simnumber, String servicenumber)
	{
		return simDetailsRepository.findBySimNumerAndServiceNumber(simnumber, servicenumber);	
	}

	@Override
	public SimOffers getSimOfferDetails(int simid) {
		return  simOffersRepository.findBySimId(simid);
	}
	
}
