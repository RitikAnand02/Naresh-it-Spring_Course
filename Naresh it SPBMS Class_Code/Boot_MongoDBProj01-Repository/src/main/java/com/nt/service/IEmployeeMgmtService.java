package com.nt.service;

import java.util.List;

import com.nt.document.Employee;

public interface IEmployeeMgmtService {
   public String saveEmployee(Employee emp);
   public List<Employee> showAllEmployee();
   public String searchEmployeeById(String idVal);
   public String modifyEmployeeById(String idVal, Double newSal);
}
