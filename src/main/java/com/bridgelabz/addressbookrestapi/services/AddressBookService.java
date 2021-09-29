package com.bridgelabz.addressbookrestapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookrestapi.dto.AddressBookDTO;
import com.bridgelabz.addressbookrestapi.exceptions.AddressBookException;
import com.bridgelabz.addressbookrestapi.model.AddressBookData;
//import com.example.EmployeePayrollApp.exceptions.EmployeePayrollException;

@Service
public class AddressBookService implements IAddressBookService {

	private List<AddressBookData> addressbookList=new ArrayList<>();
	
	public List<AddressBookData> getAddressBookData() {
		// TODO Auto-generated method stub
		return addressbookList;
	}

	public AddressBookData getcontactDataNyId(int contactId) {
		// TODO Auto-generated method stub
		return addressbookList.stream().filter(contactData->contactData.getContactId()==contactId)
				.findFirst()
				.orElseThrow(()->new AddressBookException("contact not found"));
	
	}

	public AddressBookData createContact(AddressBookDTO addressbookDTO) {
		// TODO Auto-generated method stub
		AddressBookData addressbookData=null;
		addressbookData=new AddressBookData(addressbookList.size()+1,addressbookDTO);
		addressbookList.add(addressbookData);
		return addressbookData;
	}

	public AddressBookData updatedContactData(int contactId, AddressBookDTO addressbookDTO) {
		// TODO Auto-generated method stub
		AddressBookData addressbookData=this.getcontactDataNyId(contactId);
		addressbookData.setName(addressbookDTO.name);
		addressbookData.setPhoneNo(addressbookDTO.phoneNo);
		addressbookList.set(contactId-1, addressbookData);
		return addressbookData;
	}

	public void deleteAddressBookData(int contactId) {
		// TODO Auto-generated method stub
		addressbookList.remove(contactId-1);
	}



}
