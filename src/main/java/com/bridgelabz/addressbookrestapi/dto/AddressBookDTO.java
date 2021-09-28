package com.bridgelabz.addressbookrestapi.dto;

public class AddressBookDTO {
	public String name;
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
