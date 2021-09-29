package com.bridgelabz.addressbookrestapi.dto;

import java.util.List;

import javax.validation.constraints.Pattern;

import lombok.ToString;

public @ToString class AddressBookDTO {
	
	@Pattern(regexp="^[A-Z]{1}[a-zA-Z\\s]{2,}$",message="Employee name Invalid")
	public String name;
	
	@Pattern(regexp="(0/91)?[7-9][0-9]{9}",message="Phone No Invalid")
	public String phoneNo;
	
	
	public String address;
	
	public String city;
	
	public String state;
	
	public List<String> departments;

	
}
