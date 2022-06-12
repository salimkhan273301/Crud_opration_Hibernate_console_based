package com.example.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.example.model.Student;

public class HibernateCon {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	
	public void saveStudent(Student student)
	{
		
		  
		  //Create session factory object
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  //getting session object from session factory
		  Session session = sessionFactory.openSession();
		  //getting transaction object from session object
		  session.beginTransaction();
		  
		  session.save(student);
		  System.out.println("Inserted Successfully");
		  session.getTransaction().commit();
		  session.close();
		 // sessionFactory.close();
	}
	
	public List<Student> listStudent()
	{
		 //Create session factory object
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  //getting session object from session factory
		  Session session = sessionFactory.openSession();
		  //getting transaction object from session object
		Transaction txn=  session.beginTransaction();
		  Query query = session.createQuery("from Student");
		  List students = query.list();
		  txn.commit();
		  //session.close();
		
		return students;
	}
	
	public void deleteStudent(int id)
	{
		 //Create session factory object
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  //getting session object from session factory
		  Session session = sessionFactory.openSession();
		  //getting transaction object from session object
		  session.beginTransaction();
		  Student student = (Student)session.load(Student.class, id);
		  session.delete(student);
		 
		  session.getTransaction().commit();
		  
		  System.out.println("Data Deleted Successfully");
		  
		  //sessionFactory.close();
		 }
	
	public void updateStudent(int id) throws IOException
	{
		
		
		 //Create session factory object
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  //getting session object from session factory
		  Session session = sessionFactory.openSession();
		  //getting transaction object from session object
		  session.beginTransaction();
		  
		  Student s = (Student)session.get(Student.class, id);
		  
		
			System.out.println("Enter New Name:");
			s.setName(br.readLine());
			System.out.println("Enter New city:");
			s.setCity(br.readLine());
			System.out.println("enter New State:");
			s.setState(br.readLine());


		 
		  
		  session.getTransaction().commit();
		  
		  System.out.println("Updated Successfully");
		 
		  //sessionFactory.close();
		 }
	
	public void getStudent(int id) {
		

		 //Create session factory object
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  //getting session object from session factory
		  Session session = sessionFactory.openSession();
		  //getting transaction object from session object
		 Transaction txn= session.beginTransaction();
		  
		  Student s = (Student)session.get(Student.class, id);
		  System.out.println(s);
		  txn.commit();
		
	}
	
	

}
