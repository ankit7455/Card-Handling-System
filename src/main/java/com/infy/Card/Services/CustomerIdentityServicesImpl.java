package com.infy.Card.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.Card.Domain.CustomerIdentity;
import com.infy.Card.Repository.CustomerIdentityRepository;
@Service
public class CustomerIdentityServicesImpl implements CustomerIdentityServices{

	@Autowired
	private CustomerIdentityRepository customerIdentityRepository;
	@Override
	public CustomerIdentity verificationCustomerIdentity(String firstname, String lastname) {
		return customerIdentityRepository.findByFirstNameAndLastName(firstname, lastname);		
	}

}
