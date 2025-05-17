package com.nt.runner;

import java.util.ArrayList;
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
		//child objs
		PhoneNumber ph1=new PhoneNumber(9199999L, "airtel", "office");
		PhoneNumber ph2=new PhoneNumber(8188888L, "jio", "residence");
		
		//parent obj
		Customer  cust=new Customer("ramesh","hyd",9000.0);
		//assign parent obj to childs objects
		ph1.setCust(cust); ph2.setCust(cust);
		//assign  child objs to parent obj
		cust.setPhones(Set.of(ph1, ph2));
		
		try {
			String msg=custService.registerCustomerWithPhoneNumbers(cust);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		/*//child objs
				PhoneNumber ph1=new PhoneNumber(9299999L, "airtel", "office");
				PhoneNumber ph2=new PhoneNumber(8288888L, "jio", "residence");
				
				//parent obj
				Customer  cust=new Customer("suresh","hyd",9000.0);
				//assign parent obj to childs objects
				ph1.setCust(cust); ph2.setCust(cust);
				//assign  child objs to parent obj
				Set<PhoneNumber> set=new HashSet<PhoneNumber>();
				set.add(ph1); set.add(ph2);
				cust.setPhones(set);
				
				try {
					List<PhoneNumber>  list=new ArrayList<>();
					list.add(ph1); list.add(ph2);
					String msg=custService.registerPhoneNumbersWithCustomer(list);
					System.out.println(msg);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
		*/

		/*	try {
				
			   Iterable<Customer>  list=custService.loadCustomersWithPhoneNumbers();
				/*list.forEach(cust->{
				   System.out.println("parent(Customer)::"+cust);
				   System.out.println("---------------------------------");
				   Set<PhoneNumber> childs=cust.getPhones();
				   
				   childs.forEach(ph->{
					   System.out.println("Child (PhoneNumber)::"+ph);
				   }); 
				   System.out.println("=====================");
					   
				  });
							
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/

		/*try {
			 Iterable<PhoneNumber>  list=custService.loadPhoneNumbersAndCustomers();
				list.forEach(ph->{
				 System.out.println("child ::"+ph);
				 Customer cust=ph.getCust();
				 System.out.println("parent ::"+cust);
				});
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		/*try {
			String msg=custService.removeCustomerAndHisPhoneNumbers(104);
			System.out.println(msg);
			}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		/*	try {
				String msg=custService.removeAllPhoneNumbersOfACustomer(105);
				System.out.println(msg);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		/*try {
			PhoneNumber ph=new PhoneNumber(87856656L, "airtel", "office");
			String msg=custService.addNewPhoneNumberToCustomer(105, ph);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		/*try {
			String msg=custService.removePhoneNumbersAndTheirCustomer(List.of(1111,1112));
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
	}// main

}// class
