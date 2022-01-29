package com.infy.Card.Services;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.Card.Domain.Customer;
import com.infy.Card.Domain.CardDetails;
import com.infy.Card.Repository.CustomerRepository;
import com.infy.Card.Repository.GetSimStatusRepository;
import com.infy.Card.Repository.CardDetailsRepository;
@Service
public class CustomerServicesImpl implements CustomerServices{

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private GetSimStatusRepository getSimStatusRepository;
	@Autowired
	private CardDetailsRepository cardDetailsRepository;
	@Override
	public Customer verifycustomerbasicdetail(LocalDate dob, String emailid) {
		return customerRepository.findByDateOfBirthAndEmailAddress(dob, emailid);
	}
	@Override
	public Customer VerifyIdProof(String idNumber) {
		return customerRepository.findByUniqueIdNumber(idNumber);
	}
	@Override
	public CardDetails verifysimstatus(int simid) {
		return getSimStatusRepository.findBySimId(simid);
	}
	@Override
	public void updatesimstatus(String status, int simid) {
		cardDetailsRepository.updateSimStatus(status, simid);		
	}
	
}
