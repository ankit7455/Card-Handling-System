package com.infy.SIMActivation.Services;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.SIMActivation.Domain.Customer;
import com.infy.SIMActivation.Domain.SimDetails;
import com.infy.SIMActivation.Repository.CustomerRepository;
import com.infy.SIMActivation.Repository.GetSimStatusRepository;
import com.infy.SIMActivation.Repository.SimDetailsRepository;
@Service
public class CustomerServicesImpl implements CustomerServices{

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private GetSimStatusRepository getSimStatusRepository;
	@Autowired
	private SimDetailsRepository simDetailsRepository;
	@Override
	public Customer verifycustomerbasicdetail(LocalDate dob, String emailid) {
		return customerRepository.findByDateOfBirthAndEmailAddress(dob, emailid);
	}
	@Override
	public Customer VerifyIdProof(String idNumber) {
		return customerRepository.findByUniqueIdNumber(idNumber);
	}
	@Override
	public SimDetails verifysimstatus(int simid) {
		return getSimStatusRepository.findBySimId(simid);
	}
	@Override
	public void updatesimstatus(String status, int simid) {
		simDetailsRepository.updateSimStatus(status, simid);		
	}
	
}
