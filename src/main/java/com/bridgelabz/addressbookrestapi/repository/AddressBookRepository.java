package com.bridgelabz.addressbookrestapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bridgelabz.addressbookrestapi.model.AddressBookData;

public interface AddressBookRepository extends JpaRepository<AddressBookData,Integer> {
@Query(value="select * from contacts,addressbook_department where contact_id=id and departments= :department",nativeQuery=true)
List<AddressBookData> findcontactByDepartment(String department);
}
