package com.bridgelabz.addressbookrestapi.model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.*;
import com.bridgelabz.addressbookrestapi.dto.AddressBookDTO;

import lombok.Data;

@Entity
@Table(name="contacts")
public @Data class AddressBookData {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="contact_id")
	private int contactId;
	private String name;
	private String phoneNo;
	public String address;
	public String city;
	public String state;
	
	@ElementCollection
	@CollectionTable(name="addressbook_department",joinColumns=@JoinColumn(name="id"))
	@Column(name="departments")
	private List<String> departments;
	
	public AddressBookData(AddressBookDTO addressbookdto) {
		this.updateAddressBookData(addressbookdto);
	}
	
	public  void updateAddressBookData(AddressBookDTO addressbookdto) {
		//this.contactId = contactId;
		this.name=addressbookdto.name;
		this.phoneNo=addressbookdto.phoneNo;
		this.address=addressbookdto.address;
		this.city=addressbookdto.city;
		this.state=addressbookdto.state;
		this.departments=addressbookdto.departments;
	}

	
}
