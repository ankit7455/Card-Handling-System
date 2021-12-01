package com.infy.SIMActivation.Services;

import org.springframework.stereotype.Service;

import com.infy.SIMActivation.Domain.CustomerAddress;
import com.infy.SIMActivation.Exceptions.NotValidDetailsException;
@Service
public interface CustomerAddressServices {
	public String updationCustomerAddress(long pincode,String add,String city,String State);
}
