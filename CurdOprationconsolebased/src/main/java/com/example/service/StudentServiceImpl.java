package com.example.service;

import com.example.model.Student;

import java.io.IOException;
import java.util.List;

import com.example.dao.HibernateCon;

public class StudentServiceImpl implements StudentService {
	
HibernateCon con=new HibernateCon();	
	
	public void studentForm(Student s)
	{
	
		con.saveStudent(s);
		
		System.out.println(s);
		
	}

	public List<Student> listShow() {
		
		List list=con.listStudent();
		return list;
		
		
	}
	
	public void removeStudent(int id)
	{
		con.deleteStudent(id);
	}
	
	
	
	
	public void updateInfo(int id) throws IOException
	{
		con.updateStudent(id);
		
	}
	
	public void getInfo(int id)
	{
		con.getStudent(id);
	}

}
