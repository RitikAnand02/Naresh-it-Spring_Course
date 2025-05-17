package com.nt.service;

import java.util.List;

import com.nt.entity.Customer;
import com.nt.entity.PhoneNumber;

public interface ICustomerMgmtService {
  public List<Object[]>  findCustomersAndPhoneNumbersData();  
}
