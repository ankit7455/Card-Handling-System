package com.infy.SIMActivation.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.SIMActivation.Domain.CustomerAddress;
import com.infy.SIMActivation.Repository.AddCustomerAddressRepository;
import com.infy.SIMActivation.Repository.CustomerAddressRepository;
import com.infy.SIMActivation.Repository.UpdateCustomerAddressRepository;

@Service
public class CustomerAddressServicesImpl implements CustomerAddressServices 
{

	@Autowired
	private CustomerAddressRepository customerAddressRepository;
	
	@Autowired
	private AddCustomerAddressRepository addCustomerAddressRepository;
	
	@Autowired
	private UpdateCustomerAddressRepository updateCustomerAddressRepository;
	@Override
	public String updationCustomerAddress(long pincode, String add, String city, String State) {
		if(customerAddressRepository.findByCityAndState(city, State)==null)
		{
			addCustomerAddressRepository.InsertCustomerAddress(pincode, add, city, State);
			return "New Address added Sucessfully";
		}
		else {
			updateCustomerAddressRepository.updateCustomerAddress(pincode, add, city, State);
			return "Address Updated Sucessfully";
		}
		
	}

}
