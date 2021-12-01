package com.infy.SIMActivation.Controller;

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

import com.infy.SIMActivation.Domain.SimDetails;
import com.infy.SIMActivation.Domain.SimOffers;
import com.infy.SIMActivation.Exceptions.NotValidDetailsException;
import com.infy.SIMActivation.Services.SimDetailsServices;
import com.infy.SIMActivation.Services.SimDetailsServicesImpl;
import com.infy.SIMActivation.validation.ValidateSimDetail;

@RestController
@RequestMapping("/simdetails")
@Validated
public class SimDetailsController {
	@Autowired
	private SimDetailsServices simDetailsServices;
	
	@PostMapping(value = "/validate")
	public ResponseEntity<String> validateCustomer(@Valid @RequestBody ValidateSimDetail validateCustomer) throws NotValidDetailsException
	{
		 
		 SimDetails simdetails1 = simDetailsServices.verificationservice
				(validateCustomer.getSimnumber(), validateCustomer.getServicenumber());
		if(simdetails1 == null)
			return ResponseEntity.ok("not available");
		else {
			SimOffers simOffers= simDetailsServices.getSimOfferDetails(simdetails1.getSimId());
			return ResponseEntity.ok(simOffers.getOfferName());
		}
		
	}
}
