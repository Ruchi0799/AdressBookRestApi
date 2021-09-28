package com.bridgelabz.addressbookrestapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressbookrestapi.dto.AddressBookDTO;
import com.bridgelabz.addressbookrestapi.dto.ResponseDTO;
import com.bridgelabz.addressbookrestapi.model.AddressBookData;
import com.bridgelabz.addressbookrestapi.services.AddressBookService;
import com.bridgelabz.addressbookrestapi.services.IAddressBookService;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
	
	@Autowired
	private IAddressBookService AddressBookService;

	@RequestMapping({"","/","/get"})
	public ResponseEntity<ResponseDTO>  getaddressbookData(){
		List<AddressBookData> addressbookData=null;
		addressbookData=AddressBookService.getAddressBookData();
		ResponseDTO respDTO=new ResponseDTO("Get call Success",addressbookData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@GetMapping("/get/{contactId}")
	public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("contactId") int contactId){
		AddressBookData addressbookData=AddressBookService.getcontactDataNyId(contactId);
		ResponseDTO respDTO=new ResponseDTO("Get call Success",addressbookData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addAddresssBookData(@RequestBody AddressBookDTO addressbookDTO)
	{
		//EmployeePayrollData employeePayrollData=null;
		AddressBookData addressbookData=AddressBookService.createContact(addressbookDTO);
		ResponseDTO respDTO=new ResponseDTO("Created Contact Sucessfully ",addressbookData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@PutMapping("/update/{contactId}") 
	public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("contactId") int contactId,@RequestBody AddressBookDTO addressbookDTO){
		AddressBookData addressbookData=AddressBookService.updatedContactData(contactId, addressbookDTO);
		ResponseDTO respDTO=new ResponseDTO("Updates Contact Data Sucessfully",addressbookData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);

		
	}
	
	@DeleteMapping("/delete/{contactId}")
	public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("contactId") int contactId){
		AddressBookService.deleteAddressBookData(contactId);
		ResponseDTO respDTO=new ResponseDTO("Deleted Sucessfully","Deleted Id: "+contactId);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
}
