package com.nt;

import java.io.Closeable;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.PayrollOperationsController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootIocProj05MiniProject1DatabaseApplication {

	public static void main(String[] args) {
	  try {
		  ApplicationContext ctx= SpringApplication.run(BootIocProj05MiniProject1DatabaseApplication.class, args);
			
		  Scanner sc = new Scanner(System.in);
				PayrollOperationsController controller =   ctx.getBean("payroll",PayrollOperationsController.class);
				
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
			((ConfigurableApplicationContext) ctx).close();
		  }
		catch (Exception e) {
			System.out.println("Internal Problem ::"+e.getMessage());
			e.printStackTrace();
		}
	  }
	
}	
	
