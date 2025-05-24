package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IEmployeeMgmtService;

@Component
public class MongoTestRunner implements CommandLineRunner {
	
	@Autowired
	private IEmployeeMgmtService empService;

	@Override
	public void run(String... args) throws Exception {
		/*try {
		Employee emp = new Employee();
		emp.setEno(101); emp.setEname("Ritik"); emp.setEaddrs("Bihar"); emp.setSalary(10000.0);
		emp.setIsVaccinated(true);
		System.out.println(empService.saveEmployee(emp));
		}
		catch(Exception e){
			e.printStackTrace();
		}*/
		
		/*	try {
				empService.showAllEmployee().forEach(System.out::println);
			}
			catch (Exception e) {
				e.printStackTrace();
			}*/
		
		/*		try {
					System.out.println("Data Info By ID Value ::"+empService.searchEmployeeById("683191c808b809774e61138e"));
				} catch (Exception e) {
					e.printStackTrace();
				}*/
		
		try {
			System.out.println(empService.modifyEmployeeById("683191c808b809774e61138e", 20000.0));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
