package com.infy.SIMActivation.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.SIMActivation.Domain.Customer;
import com.infy.SIMActivation.Domain.SimDetails;
import com.infy.SIMActivation.Exceptions.NotValidDetailsException;
import com.infy.SIMActivation.Services.CustomerServices;
import com.infy.SIMActivation.validation.ValidateIdProof;

@RestController
@RequestMapping(value = "/idproof")
@Validated
public class IdProofValidationController {
	@Autowired
	private CustomerServices customerServices;
	
	@PutMapping(value = "/validate")
	public ResponseEntity<String> validateIdproof(@Valid @RequestBody ValidateIdProof val) throws NotValidDetailsException
	{
		Customer customer = customerServices.VerifyIdProof(val.getIdNumber());
		if(customer == null)
		{
			return ResponseEntity.ok("Invalid details");
		}
		else {
			
			if(customer.getFirstName().matches(val.getFirstname()) && 
					customer.getLastName().matches(val.getLastname())&&
					customer.getDateOfBirth().equals(val.getDobDate()))	
			{
				SimDetails d1 = customerServices.verifysimstatus(customer.getSimId());
				//System.out.println(d1.getSimStatus());
				if(d1.getSimStatus().matches("active"))
					return ResponseEntity.ok("Sim status is active");
				else if(d1.getSimStatus().matches("inactive"))
				{
					customerServices.updatesimstatus("active", customer.getSimId());
					return ResponseEntity.ok("sim status is activated");
				}
				else
				{
					return ResponseEntity.ok("Enter Valid Details");
				}
			}
			else {
				return ResponseEntity.ok("Invalid Details");
			}
		}
		
	}
}
