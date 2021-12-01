package com.infy.SIMActivation.Services;

import org.springframework.stereotype.Service;
import com.infy.SIMActivation.Domain.SimDetails;
import com.infy.SIMActivation.Domain.SimOffers;
@Service
public interface SimDetailsServices {	
	
	public SimDetails verificationservice(String simnumber, String servicenumber);
	public SimOffers getSimOfferDetails(int simid);
}
