package com.nt.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.nt.entity.Employee;

@Component
public class EmployeeItemProcessor  implements ItemProcessor<Employee, Employee> {

	@Override
	public Employee process(Employee item) throws Exception {
	
		  if(item.getSalary()>500000) {
			  item.setGrossSalary(item.getSalary()+ item.getSalary()*0.4f);
			  item.setNetSalary(item.getGrossSalary()-item.getGrossSalary()*0.2f);
			  return item;
		  }
		return null;
	}

}
