package com.bridgelabz.addressbookrestapi.model;

import com.bridgelabz.addressbookrestapi.dto.AddressBookDTO;

public class AddressBookData {
	private int contactId;
	private String name;
	private String phoneNo;
	public AddressBookData(int contactId,AddressBookDTO addressbookdto) {
		super();
		this.contactId = contactId;
		this.name=addressbookdto.name;
		this.phoneNo=addressbookdto.phoneNo;
	}
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
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
