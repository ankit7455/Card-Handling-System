package com.infy.SIMActivation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.SIMActivation.Domain.CustomerIdentity;
@Repository
public interface CustomerIdentityRepository extends JpaRepository<CustomerIdentity, Long>{
	
	public CustomerIdentity findByFirstNameAndLastName(String firstname,String lastname);
}
