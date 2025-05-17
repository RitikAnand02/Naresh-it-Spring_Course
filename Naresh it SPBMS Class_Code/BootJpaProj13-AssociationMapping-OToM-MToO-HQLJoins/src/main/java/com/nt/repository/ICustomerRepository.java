package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
	//@Query("select c.cno,c.cname,c.caddrs,c.billamt,ph.regNo,ph.mobileNo,ph.provider,ph.type from Customer c inner join c.phones ph")
	//@Query("select c.cno,c.cname,c.caddrs,c.billamt,ph.regNo,ph.mobileNo,ph.provider,ph.type from Customer c  left  join c.phones ph")
	//@Query("select c.cno,c.cname,c.caddrs,c.billamt,ph.regNo,ph.mobileNo,ph.provider,ph.type from Customer c  right join c.phones ph")
	@Query("select c.cno,c.cname,c.caddrs,c.billamt,ph.regNo,ph.mobileNo,ph.provider,ph.type from Customer c  full join c.phones ph")
	   
	public List<Object[]>  showCustomerAndPhoneNumbersDataUsingJoins();
 }
