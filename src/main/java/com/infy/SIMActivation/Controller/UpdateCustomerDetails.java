package com.infy.SIMActivation.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.SIMActivation.Domain.CustomerAddress;
import com.infy.SIMActivation.Exceptions.NotValidDetailsException;
import com.infy.SIMActivation.Services.CustomerAddressServices;
import com.infy.SIMActivation.validation.ValidatePersonalDetails;
import com.infy.SIMActivation.validation.ValidateUpdateDetail;

@RestController
@RequestMapping("/updatecustomerdetails")
@Valid
public class UpdateCustomerDetails {
	@Autowired
	private CustomerAddressServices customerAddressServices;
	
	@PutMapping(value = "/validate")
	public ResponseEntity<String> validateAddreessDetails
	(@Valid @RequestBody ValidateUpdateDetail vpd) throws NotValidDetailsException
	{
		String message  = customerAddressServices.updationCustomerAddress(
				(long) vpd.getPincode(), vpd.getAddress(), vpd.getCity(), vpd.getState());
		return ResponseEntity.ok(message);
	}
}
