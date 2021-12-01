package com.infy.SIMActivation.Services;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.infy.SIMActivation.Domain.Customer;
import com.infy.SIMActivation.Domain.SimDetails;
@Service
public interface CustomerServices {
	public Customer verifycustomerbasicdetail(LocalDate dob,String emailid);
	public Customer VerifyIdProof(String idNumber);
	public SimDetails verifysimstatus(int simid);
	public void updatesimstatus(String status,int simid) ;
}
