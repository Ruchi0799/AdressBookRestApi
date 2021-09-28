package com.bridgelabz.addressbookrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.extern.slf4j.Slf4j;


@SpringBootApplication
@Slf4j
public class AddressbookrestapiApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(AddressbookrestapiApplication.class, args);
		log.info("AddressBook App started in {} Envoronment",
				context.getEnvironment().getProperty("environment"));
		log.info("Employee payroll db user is {} ",context.getEnvironment().getProperty("spring.datasource.username"));
	}

}
