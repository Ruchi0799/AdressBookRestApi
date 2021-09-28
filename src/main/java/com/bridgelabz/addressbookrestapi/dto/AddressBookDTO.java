package com.bridgelabz.addressbookrestapi.dto;

import javax.validation.constraints.Pattern;

public class AddressBookDTO {
	
	@Pattern(regexp="^[A-Z]{1}[a-zA-Z\\s]{2,}$",message="Employee name Invalid")
	public String name;
	
	@Pattern(regexp="(0/91)?[7-9][0-9]{9}",message="Phone No Invalid")
	public String phoneNo;
	@Override
	public String toString() {
		return "AddressBookDTO [name=" + name + ", phoneNo=" + phoneNo + "]";
	}
	public AddressBookDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AddressBookDTO(String name, String phoneNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

}
