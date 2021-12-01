package com.infy.SIMActivation.DTO;

import java.util.Date;

public class CustomerIdentityDTO {
	private Long uniqueIdNumber;
	private Date dateOfbirth;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String state;
	
	public Long getUniqueIdNumber() {
		return uniqueIdNumber;
	}
	public void setUniqueIdNumber(Long uniqueIdNumber) {
		this.uniqueIdNumber = uniqueIdNumber;
	}
	public Date getDateOfbirth() {
		return dateOfbirth;
	}
	public void setDateOfbirth(Date dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "CustomerIdentity [uniqueIdNumber=" + uniqueIdNumber + ", dateOfbirth=" + dateOfbirth + ", firstName="
				+ firstName + ", lastName=" + lastName + ", emailAddress=" + emailAddress + ", state=" + state + "]";
	}
	
	
}
