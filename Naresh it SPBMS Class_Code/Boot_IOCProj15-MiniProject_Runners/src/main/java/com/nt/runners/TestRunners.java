package com.nt.runners;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.controller.PayrollOperationsController;
import com.nt.model.Employee;

@Component
public class TestRunners implements CommandLineRunner {
    
	@Autowired
	private PayrollOperationsController controller;
	
	@Override
	public void run(String... args) throws Exception {
		 Scanner sc = new Scanner(System.in);
			
		System.out.println("========Resgister Employee======");
		
		System.out.println("Enter Name:: ");
		String name =sc.next();
		System.out.println("Enter Desg:: ");
		String desg =sc.next();
		System.out.println("Enter Salary:: ");
		double salary =sc.nextDouble();
		System.out.println("Enter Dept No(10,20,30,40,...):: ");
		int deptno =sc.nextInt();
		
		Employee emp1 =new Employee();
		emp1.setEname(name);
		emp1.setDesg(desg);
		emp1.setSalary(salary);
		emp1.setDeptno(deptno);
		
		try {
			String resultMsg = controller.processEmployee(emp1);
			System.out.println(resultMsg);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("========Search Employee======");
		System.out.println("Enter Desg1::");
		String desg1 = sc.next();
		
		System.out.println("Enter Desg2::");
		String desg2 = sc.next();
		
		System.out.println("Enter Desg3::");
		String desg3 = sc.next();
		
		List<Employee> list = controller.showAllEmployeesByDesgs(desg1, desg2, desg3);
		System.out.println("Empolyees belonging to "+desg1+" "+desg2+" "+desg3+" are ");
		list.forEach(emp->{
		  System.out.println(emp);
		});
		
		sc.close();

	}

}
