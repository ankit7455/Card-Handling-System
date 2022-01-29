package com.infy.Card.Services;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.infy.Card.Domain.Customer;
import com.infy.Card.Domain.CardDetails;
@Service
public interface CustomerServices {
	public Customer verifycustomerbasicdetail(LocalDate dob,String emailid);
	public Customer VerifyIdProof(String idNumber);
	public CardDetails verifysimstatus(int simid);
	public void updatesimstatus(String status,int simid) ;
}
