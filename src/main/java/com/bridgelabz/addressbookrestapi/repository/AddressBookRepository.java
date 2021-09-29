package com.bridgelabz.addressbookrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.addressbookrestapi.model.AddressBookData;

public interface AddressBookRepository extends JpaRepository<AddressBookData,Integer> {

}
