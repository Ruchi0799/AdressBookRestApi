package com.bridgelabz.addressbookrestapi.services;

import java.util.List;

import com.bridgelabz.addressbookrestapi.dto.AddressBookDTO;
import com.bridgelabz.addressbookrestapi.model.AddressBookData;

public interface IAddressBookService {
	List<AddressBookData> getAddressBookData();
	AddressBookData getcontactDataNyId(int contactId);
	AddressBookData createContact(AddressBookDTO addressbookDTO);
	AddressBookData updatedContactData(int contactId, AddressBookDTO addressbookDTO);
	void deleteAddressBookData(int contactId);
}
