package com.infy.Card.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.infy.Card.Domain.Customer;
import com.infy.Card.Exceptions.NotValidDetailsException;
import com.infy.Card.Services.CustomerServices;
import com.infy.Card.validation.ValidateCustomerBasicDetail;

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
