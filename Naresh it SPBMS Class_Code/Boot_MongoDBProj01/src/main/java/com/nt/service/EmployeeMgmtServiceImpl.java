package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.Employee;
import com.nt.repository.IEmployeeRepo;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	
     @Autowired
	private IEmployeeRepo empRepo;
     
	@Override
	public String saveEmployee(Employee emp) {
		
		return "Data is Saved With id Value ::"+empRepo.insert(emp).getId();
	}

	@Override
	public List<Employee> showAllEmployee() {
		return empRepo.findAll();
	}
	
	@Override
	public String searchEmployeeById(String idVal) {
		Optional<Employee> opt = empRepo.findById(idVal);
		if(opt.isEmpty())
			return "Data is Not Found";
		else
		return opt.get().toString();
	}

	@Override
	public String modifyEmployeeById(String idVal, Double newSal) {
		Optional<Employee> opt = empRepo.findById(idVal);
		if(opt.isEmpty())
		{
			return "Data is Not Found";
		}
		else {
			Employee emp = opt.get();
			emp.setSalary(newSal);
			empRepo.save(emp);
			return "Data is Updated";		}

	}
}
