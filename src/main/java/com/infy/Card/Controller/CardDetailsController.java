package com.infy.Card.Controller;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.Card.Domain.CardDetails;
import com.infy.Card.Domain.CardOffers;
import com.infy.Card.Exceptions.NotValidDetailsException;
import com.infy.Card.Services.CardDetailsServices;
import com.infy.Card.Services.CardDetailsServicesImpl;
import com.infy.Card.validation.ValidateSimDetail;

@RestController
@RequestMapping("/simdetails")
@Validated
public class CardDetailsController {
	@Autowired
	private CardDetailsServices cardDetailsServices;
	
	@PostMapping(value = "/validate")
	public ResponseEntity<String> validateCustomer(@Valid @RequestBody ValidateSimDetail validateCustomer) throws NotValidDetailsException
	{
		 
		 CardDetails simdetails1 = cardDetailsServices.verificationservice
				(validateCustomer.getSimnumber(), validateCustomer.getServicenumber());
		if(simdetails1 == null)
			return ResponseEntity.ok("not available");
		else {
			CardOffers cardOffers= cardDetailsServices.getSimOfferDetails(simdetails1.getSimId());
			return ResponseEntity.ok(cardOffers.getOfferName());
		}
		
	}
}
