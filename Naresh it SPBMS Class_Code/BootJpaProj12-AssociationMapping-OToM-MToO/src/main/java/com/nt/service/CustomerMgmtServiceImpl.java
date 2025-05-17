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
	public String registerCustomerWithPhoneNumbers(Customer cust) {
		//use repo
		int idVal=custRepo.save(cust).getCno();
		return "Customer  is saved with  the id Value:"+idVal;
	}

	@Override
	public String registerPhoneNumbersWithCustomer(List<PhoneNumber> list) {
		//use repo
		List<PhoneNumber>  savedList=phoneRepo.saveAll(list);
		List<Integer> ids=savedList.stream().map(PhoneNumber::getRegNo).collect(Collectors.toList());
		return   ids.size()+"  no.of records are saved having id values ::"+ids;
	}
	
	@Override
	public Iterable<Customer> loadCustomersWithPhoneNumbers() {
		return custRepo.findAll();
	}
	
	@Override
	public Iterable<PhoneNumber> loadPhoneNumbersAndCustomers() {
	return phoneRepo.findAll();
	}

	@Override
	public String removeCustomerAndHisPhoneNumbers(int custId) {
		// load  customer  by its id
		Optional<Customer>  opt=custRepo.findById(custId);
		if(opt.isPresent()) {
			Customer cust=opt.get();
			//delete the customer and its Child objs
			custRepo.delete(cust);
			return custId+" Customer and its  PhoneNumber objs are deleted";
		}
		return custId+" Customer is not found";
	}
	
	@Override
	public String removeAllPhoneNumbersOfACustomer(int custId) {
		// load  customer  by its id
		Optional<Customer>  opt=custRepo.findById(custId);
		 if(opt.isPresent()) {
			 //get parent obj
			 Customer cust=opt.get();
			 //get child objs of  a Parent
			 Set<PhoneNumber> childs=cust.getPhones();
			 //nullify parent of each object
			 childs.forEach(ph->{
				 ph.setCust(null);
			 });
			 //delete all  childs of a parent
			 phoneRepo.deleteAllInBatch(childs);
			 return custId+" Customer   phone Numbers are deleted";
		 }
				
		return custId+" Customer phone Numbers are not foud for deletion";
	}
	
	@Override
	public String addNewPhoneNumberToCustomer(int custId, PhoneNumber newPh) {
		// load  customer  by its id
				Optional<Customer>  opt=custRepo.findById(custId);
				 if(opt.isPresent()) {
					 //get parent obj
					 Customer cust=opt.get();
					 //get child objs of  a Parent
					 Set<PhoneNumber> childs=cust.getPhones();
					 //add parent to  new child
					 newPh.setCust(cust);
					 //add new child to existing childs
					 childs.add(newPh);
					 //save  the parent  (update the parent)
					 custRepo.save(cust);
				     return custId+" customer is added with  new PhoneNumber";
				 }
				 return custId+" customer is not found";
		}//method
	
	@Override
	public String removePhoneNumbersAndTheirCustomer(Iterable<Integer> regNos) {
		  //Load  childs by ids
		Iterable<PhoneNumber> list=phoneRepo.findAllById(regNos);
		  //detele childs objs
		  list.forEach(ph->{
			  phoneRepo.delete(ph);
		  });
		  return  StreamSupport.stream(list.spliterator(), false).count()+" no.of  childs and their parents are deleted";
		
	}

}
