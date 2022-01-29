package com.infy.Card.Services;

import org.springframework.stereotype.Service;

import com.infy.Card.Domain.CustomerAddress;
import com.infy.Card.Exceptions.NotValidDetailsException;
@Service
public interface CustomerAddressServices {
	public String updationCustomerAddress(long pincode,String add,String city,String State);
}
