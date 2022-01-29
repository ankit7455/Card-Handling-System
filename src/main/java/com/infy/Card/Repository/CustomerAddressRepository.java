package com.infy.Card.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infy.Card.Domain.CustomerAddress;
@Repository
public interface CustomerAddressRepository extends JpaRepository<CustomerAddress, Integer>{

		//@Query(value = "select * from CustomerAddress where city=? and state=?")
		public CustomerAddress findByCityAndState(String city,String state);

}
