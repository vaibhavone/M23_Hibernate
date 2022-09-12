package com.cg.client;

import com.cg.entities.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		StudentService service = new StudentServiceImpl();

		Student s = new Student();

		/*// create operation
		s.setRollno(101);
		s.setName("Ashutosh");
		service.addStudent(s);*/

		/*// create operation
		s.setRollno(102);
		s.setName("Sumit");
		service.addStudent(s);*/
		
		/*//retrieve data
		s=service.getStudentById(101);
		System.out.println("Student Roll no: "+s.getRollno());
		System.out.println("Student Name: "+s.getName());*/
		
		/*//updates
		s=service.getStudentById(101);
		s.setName("Shubham");
		service.updateStudent(s);*/
		
		//delete
		s=service.getStudentById(101);
		service.deleteStudent(s);
		System.out.println("Data is Deleted");
		

	}

}
