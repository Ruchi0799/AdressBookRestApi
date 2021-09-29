package com.bridgelabz.addressbookrestapi.dto;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.ToString;

public @ToString class AddressBookDTO {
	
	@Pattern(regexp="^[A-Z]{1}[a-zA-Z\\s]{2,}$",message="Employee name Invalid")
	public String name;
	
	@Pattern(regexp="(0/91)?[7-9][0-9]{9}",message="Phone No Invalid")
	public String phoneNo;
	
	@NotNull(message="address cannot be empty")
	public String address;
	
	@NotNull(message="city cannot be empty")
	public String city;
	
	@NotNull(message="state cannot be empty")
	public String state;
	
	@NotNull(message="departments cannot be empty")
	public List<String> departments;

	
}
