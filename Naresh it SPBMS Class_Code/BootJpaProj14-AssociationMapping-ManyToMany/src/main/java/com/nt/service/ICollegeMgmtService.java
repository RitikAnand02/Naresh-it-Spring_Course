//ServiceInterface
package com.nt.service;

import java.util.List;

import com.nt.entity.Faculty;
import com.nt.entity.Student;

public interface ICollegeMgmtService {
   public  String  registerStudent(List<Student> list);
   public  String  registerFacultiesAndTheirStudents(List<Faculty> list);
   public   List<Student>  showAllStudentsAndTheirFaculties();
   public   List<Faculty> showAllFacultiesAndThierStudents();
   public   String    removeStudentFromFaculty(int fid ,int sid);
   public  String    removeFacultyFromStudent(int sid,int fid);
   
}
