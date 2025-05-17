package com.nt.runners;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Faculty;
import com.nt.entity.Student;
import com.nt.service.ICollegeMgmtService;

@Component
public class ManyToManyAssociationTestRunner implements CommandLineRunner {

   @Autowired
	private  ICollegeMgmtService  collegeService;

	@Override
	public void run(String... args) throws Exception {
		/*try {
			//prepare  parent objs
			Student  stud1=new Student("raja","hyd");
			Student  stud2=new Student("mahesh","vizag");
			Student  stud3=new Student("ramesh","delhi");
			
			Faculty faculty1=new Faculty("karan","CS","M.Tech");
			Faculty faculty2=new Faculty("mahesh","Chemistry","M.sc");
			
			// assign  students faculties
			faculty1.getStudents().add(stud1);
			faculty1.getStudents().add(stud2);
			faculty1.getStudents().add(stud3);
			faculty2.getStudents().add(stud2);
			faculty2.getStudents().add(stud3);
			
			//assign  faculties to Studnets
			stud1.getFaculties().add(faculty1);
			stud2.getFaculties().add(faculty1);
			stud2.getFaculties().add(faculty2);
			stud3.getFaculties().add(faculty1);
			stud3.getFaculties().add(faculty2);
			
			//  call the service class method
			List<Student>  list=Arrays.asList(stud1,stud2,stud3);
			String msg=collegeService.registerStudent(list);
			System.out.println(msg);
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}
		*/		
		
		/*try {
			//prepare  parent objs
			Student  stud1=new Student("raja1","hyd");
			Student  stud2=new Student("mahesh1","vizag");
			Student  stud3=new Student("ramesh1","delhi");
			
			Faculty faculty1=new Faculty("karan1","CS","M.Tech");
			Faculty faculty2=new Faculty("mahesh1","Chemistry","M.sc");
			
			// assign  students faculties
			faculty1.getStudents().add(stud1);
			faculty1.getStudents().add(stud2);
			faculty1.getStudents().add(stud3);
			faculty2.getStudents().add(stud2);
			faculty2.getStudents().add(stud3);
			
			//assign  faculties to Studnets
			stud1.getFaculties().add(faculty1);
			stud2.getFaculties().add(faculty1);
			stud2.getFaculties().add(faculty2);
			stud3.getFaculties().add(faculty1);
			stud3.getFaculties().add(faculty2);
			
			//  call the service class method
			List<Faculty>  list=Arrays.asList(faculty1,faculty2);
			String msg=collegeService.registerFacultiesAndTheirStudents(list);
			System.out.println(msg);
		}
		catch(Exception  e) {
			e.printStackTrace();
		}
		*/		
		
		/*	try {
				  List<Student> list=collegeService.showAllStudentsAndTheirFaculties();
				  list.forEach(st->{
					  System.out.println("Parent ::"+st);
					  Set<Faculty>  childs=st.getFaculties();
					  childs.forEach(fc->{
						  System.out.println("Child::"+fc);
					  });
					  System.out.println("==================");
				  });
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		*/
		/*try {
			List<Faculty>  list=collegeService.showAllFacultiesAndThierStudents();
			list.forEach(fc->{
				System.out.println("Child ::"+fc);
				Set<Student> parents=fc.getStudents();
				parents.forEach(st->{
					System.out.println("parent::"+st);
				});
				System.out.println("=================");
			});
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		/*	try {
				String msg=collegeService.removeStudentFromFaculty(62,161);
				System.out.println(msg);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		try {
			String msg=collegeService.removeFacultyFromStudent(163, 63);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
	}//method

}//class
