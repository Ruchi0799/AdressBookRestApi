package com.bridgelabz.addressbookrestapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookrestapi.dto.AddressBookDTO;
import com.bridgelabz.addressbookrestapi.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService {

	private List<AddressBookData> addressbookList=new ArrayList<>();
	
	public List<AddressBookData> getAddressBookData() {
		// TODO Auto-generated method stub
		List<AddressBookData> addressbookList=new ArrayList<>();
		addressbookList.add(new AddressBookData(1,new AddressBookDTO("Pankaj","9892735509")));
		return addressbookList;
	}

	public AddressBookData getcontactDataNyId(int contactId) {
		// TODO Auto-generated method stub
		AddressBookData addressbookData=null;
		addressbookData=new AddressBookData(1,new AddressBookDTO("Pankaj","9892735509"));
		return addressbookData;
	}

	public AddressBookData createContact(AddressBookDTO addressbookDTO) {
		// TODO Auto-generated method stub
		AddressBookData addressbookData=null;
		addressbookData=new AddressBookData(1,addressbookDTO);
		return addressbookData;
	}

	public AddressBookData updatedContactData(int contactId, AddressBookDTO addressbookDTO) {
		// TODO Auto-generated method stub
		AddressBookData addressbookData=null;
		addressbookData=new AddressBookData(contactId,addressbookDTO);
		return addressbookData;
	}

	public void deleteAddressBookData(int contactId) {
		// TODO Auto-generated method stub
		
	}



}
