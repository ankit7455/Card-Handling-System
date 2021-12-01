package com.infy.SIMActivation.Services;

import org.springframework.stereotype.Service;

import com.infy.SIMActivation.Domain.CustomerIdentity;

@Service
public interface CustomerIdentityServices {
	public CustomerIdentity verificationCustomerIdentity (String firstname,String lastname) ;
}
