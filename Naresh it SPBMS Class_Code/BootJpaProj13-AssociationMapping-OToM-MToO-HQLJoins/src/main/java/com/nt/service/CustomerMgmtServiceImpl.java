package com.nt.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Customer;
import com.nt.entity.PhoneNumber;
import com.nt.repository.ICustomerRepository;
import com.nt.repository.IPhoneNumberRepository;

@Service
public class CustomerMgmtServiceImpl implements ICustomerMgmtService {
	@Autowired
	private  ICustomerRepository  custRepo;
	@Autowired
	private   IPhoneNumberRepository  phoneRepo;
	
	@Override
	public List<Object[]> findCustomersAndPhoneNumbersData() {
		return  custRepo.showCustomerAndPhoneNumbersDataUsingJoins();
	}
	
}
