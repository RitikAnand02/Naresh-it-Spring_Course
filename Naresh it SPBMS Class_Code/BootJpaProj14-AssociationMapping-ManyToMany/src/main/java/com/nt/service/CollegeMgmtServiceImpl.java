//ServiceImpl class
package com.nt.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.entity.Faculty;
import com.nt.entity.Student;
import com.nt.repository.IFacultyRepository;
import com.nt.repository.IStudentRepository;

@Service
public class CollegeMgmtServiceImpl implements ICollegeMgmtService {
	@Autowired
	private  IStudentRepository  studRepo;
	@Autowired
	private   IFacultyRepository  facultyRepo;

	@Override
	public String registerStudent(List<Student> list) {
		//save the batch
		List<Student>  savedList=studRepo.saveAll(list);
	   //get  only id values of the saved List
		List<Integer> ids=savedList.stream().map(Student::getSid).collect(Collectors.toList());
		return  "Students and associated Faculties  are saved with  id values ::"+ids;
	}
	
	@Override
	public String registerFacultiesAndTheirStudents(List<Faculty> list) {
		//save the batch
		List<Faculty>  savedList=facultyRepo.saveAll(list);
	   //get  only id values of the saved List
		List<Integer> ids=savedList.stream().map(Faculty::getFid).collect(Collectors.toList());
		return  "Faculties and associated Students  are saved with  id values ::"+ids;
	}
	@Override
	public List<Student> showAllStudentsAndTheirFaculties() {
		return studRepo.findAll(); 
	}
	
	@Override
	public List<Faculty> showAllFacultiesAndThierStudents() {
		return facultyRepo.findAll();
	}
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public String removeStudentFromFaculty(int fid, int sid) {
		 //Load  faculty
	    Faculty faculty=facultyRepo.findById(fid).orElseThrow(()-> new IllegalArgumentException("Invalid Id"));
		//Load  Student
		Student st=studRepo.findById(sid).orElseThrow(()->new IllegalArgumentException("Invalid Id"));
		//get all the students  of the faculty
			   Set<Student>  childs=faculty.getStudents();
			   //remove  student from the existing students
			   childs.remove(st);
			   //remove  faculty from the list of faculty beloging to parent
			   Set<Faculty> parents=st.getFaculties();
			   parents.remove(faculty);
			   // update the  Faculty object
			   facultyRepo.save(faculty);
			   return   sid+" Student  is  removed from  "+fid+"  Faculty's  list of  students";
	}
	
	@Override
	@Transactional
	public String removeFacultyFromStudent(int sid, int fid) {
		 //Load  faculty
	    Faculty faculty=facultyRepo.findById(fid).orElseThrow(()-> new IllegalArgumentException("Invalid Id"));
		//Load  Student
		Student st=studRepo.findById(sid).orElseThrow(()->new IllegalArgumentException("Invalid Id"));
		//get all the students  of the faculty
		   Set<Student>  childs=faculty.getStudents();
		   //remove  student from the existing students
		   childs.remove(st);
		   //remove  faculty from the list of faculty beloging to parent
		   Set<Faculty> parents=st.getFaculties();
		   parents.remove(faculty);
		   //update the Student obj
		    studRepo.save(st);
		 	return fid+" faculty is removed  for  "+sid+" student";
	}

}
