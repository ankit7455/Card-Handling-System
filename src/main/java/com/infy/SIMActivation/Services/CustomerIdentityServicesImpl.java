package com.infy.SIMActivation.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.SIMActivation.Domain.CustomerIdentity;
import com.infy.SIMActivation.Repository.CustomerIdentityRepository;
@Service
public class CustomerIdentityServicesImpl implements CustomerIdentityServices{

	@Autowired
	private CustomerIdentityRepository customerIdentityRepository;
	@Override
	public CustomerIdentity verificationCustomerIdentity(String firstname, String lastname) {
		return customerIdentityRepository.findByFirstNameAndLastName(firstname, lastname);		
	}

}
