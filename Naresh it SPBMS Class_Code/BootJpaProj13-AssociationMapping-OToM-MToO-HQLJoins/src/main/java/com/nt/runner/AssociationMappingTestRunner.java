package com.nt.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Customer;
import com.nt.entity.PhoneNumber;
import com.nt.service.ICustomerMgmtService;

@Component
public class AssociationMappingTestRunner implements CommandLineRunner {
	@Autowired
	private ICustomerMgmtService custService;

	@Override
	public void run(String... args) throws Exception {
		
		try {
			List<Object[]> list=custService.findCustomersAndPhoneNumbersData();
			list.forEach(row->{
				System.out.println(Arrays.toString(row));
			});
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			
	}// main

}// class
