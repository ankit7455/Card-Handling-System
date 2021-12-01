package com.infy.SIMActivation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.SIMActivation.Domain.SimDetails;
@Repository
public interface GetSimStatusRepository extends JpaRepository<SimDetails, Integer>{
	
	public SimDetails findBySimId(int simid);
}
