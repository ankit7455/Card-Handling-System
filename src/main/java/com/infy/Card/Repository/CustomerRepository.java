package com.infy.Card.Repository;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.infy.Card.Domain.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	public Customer findByDateOfBirthAndEmailAddress(LocalDate datedateOfBirth,String emailAddress);
	public Customer findByUniqueIdNumber(String uniqueid);
	
}