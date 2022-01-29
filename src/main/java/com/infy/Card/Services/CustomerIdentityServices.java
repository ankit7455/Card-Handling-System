package com.infy.Card.Services;

import org.springframework.stereotype.Service;

import com.infy.Card.Domain.CustomerIdentity;

@Service
public interface CustomerIdentityServices {
	public CustomerIdentity verificationCustomerIdentity (String firstname,String lastname) ;
}
