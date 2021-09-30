package com.bridgelabz.addressbookrestapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookrestapi.dto.AddressBookDTO;
import com.bridgelabz.addressbookrestapi.exceptions.AddressBookException;
import com.bridgelabz.addressbookrestapi.model.AddressBookData;
import com.bridgelabz.addressbookrestapi.repository.AddressBookRepository;

import lombok.extern.slf4j.Slf4j;
//import com.example.EmployeePayrollApp.exceptions.EmployeePayrollException;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService {
	
	@Autowired
	private AddressBookRepository addressbookrepository;

	private List<AddressBookData> addressbookList=new ArrayList<>();
	
	public List<AddressBookData> getAddressBookData() {
		// TODO Auto-generated method stub
		return addressbookrepository.findAll();
	}

	public AddressBookData getcontactDataNyId(int contactId) {
		// TODO Auto-generated method stub
		return addressbookrepository.findById(contactId).orElseThrow(()->new AddressBookException("contact not found"));
	
	}

	public AddressBookData createContact(AddressBookDTO addressbookDTO) {
		// TODO Auto-generated method stub
		AddressBookData addressbookData=null;
		addressbookData=new AddressBookData(addressbookDTO);
		addressbookList.add(addressbookData);
		log.debug(addressbookData.toString()); 
		return addressbookrepository.save(addressbookData);
	}

	public AddressBookData updatedContactData(int contactId, AddressBookDTO addressbookDTO) {
		// TODO Auto-generated method stub
		AddressBookData addressbookData=this.getcontactDataNyId(contactId);
		addressbookData.updateAddressBookData(addressbookDTO);
		return addressbookrepository.save(addressbookData);
	}

	public void deleteAddressBookData(int contactId) {
		// TODO Auto-generated method stub
		AddressBookData addressbookData=this.getcontactDataNyId(contactId);
		addressbookrepository.delete(addressbookData);;
	}

	@Override
	public List<AddressBookData> getContactByDepartment(String department) {
		// TODO Auto-generated method stub
		return addressbookrepository.findcontactByDepartment(department);
	}



}
