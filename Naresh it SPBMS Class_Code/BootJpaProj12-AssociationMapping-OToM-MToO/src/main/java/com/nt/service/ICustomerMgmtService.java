package com.nt.service;

import java.util.List;

import com.nt.entity.Customer;
import com.nt.entity.PhoneNumber;

public interface ICustomerMgmtService {
    public   String  registerCustomerWithPhoneNumbers(Customer cust);
    public  String   registerPhoneNumbersWithCustomer(List<PhoneNumber> list);
    public  Iterable<Customer>    loadCustomersWithPhoneNumbers();
    public  Iterable<PhoneNumber>  loadPhoneNumbersAndCustomers();
    public   String    removeCustomerAndHisPhoneNumbers(int custId);
    public  String    removeAllPhoneNumbersOfACustomer(int custId);
    public   String    addNewPhoneNumberToCustomer(int custId,PhoneNumber newPh);
    public   String    removePhoneNumbersAndTheirCustomer(Iterable<Integer> regNos);
    
}
