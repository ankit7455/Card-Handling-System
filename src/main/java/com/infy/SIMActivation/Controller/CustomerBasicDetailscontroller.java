package com.infy.SIMActivation.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.infy.SIMActivation.Domain.Customer;
import com.infy.SIMActivation.Exceptions.NotValidDetailsException;
import com.infy.SIMActivation.Services.CustomerServices;
import com.infy.SIMActivation.validation.ValidateCustomerBasicDetail;

@RestController
@RequestMapping("/customerbasicdetails")
@Validated
public class CustomerBasicDetailscontroller {
	
	@Autowired
	private CustomerServices customerServices;
	
	@PostMapping(value="/validatecustomerdetail")
	public ResponseEntity<String> validatecustomerbasicdetail (@Valid @RequestBody ValidateCustomerBasicDetail validateCustomerBasicDetail) throws NotValidDetailsException
	{
		Customer c1 = customerServices.verifycustomerbasicdetail(validateCustomerBasicDetail.getBirthdate(), validateCustomerBasicDetail.getEmailid());
		if(c1==null)
			return ResponseEntity.ok("No request placed for you");
		else {
			return ResponseEntity.ok("Success");
		}
	}
	
}
