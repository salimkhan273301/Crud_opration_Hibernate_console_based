package com.example.CurdOprationconsolebased;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.example.model.Student;
import com.example.service.StudentService;
import com.example.service.StudentServiceImpl;

/**
 * Author ->Mohd Salimullah
 *
 */
public class App 
{
    public static void main( String[] args )
    
  {
    	
    	 StudentService ssi=new StudentServiceImpl();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean go=true;
        while(go)
        {
        	
        	System.out.println( "***************-----======Opration=========-----******************" );
        	System.out.println("select 1 for add new Student");
        	System.out.println("select 2 for view Student");
        	System.out.println("select 3 for delete  Student");
        	System.out.println("select 4 for update Student");
        	System.out.println("select 5 for get Student");
        	System.out.println("select 6 for Exit");
        	
        	
	        	try {
	        		int input=Integer.parseInt(br.readLine());
	        		switch (input) {
					case 1:
						Student s=new Student();
						System.out.println("Enter your Name:");
						s.setName(br.readLine());
						System.out.println("Enter your city:");
						s.setCity(br.readLine());
						System.out.println("enter your State:");
						s.setState(br.readLine());
						
						ssi.studentForm(s);
						
						break;
						
					case 2:
						
						List<Student> list=new ArrayList<Student>();
						
					list=	ssi.listShow();
					for(Object x:list)
					{
					
					System.out.println(x);}
						
						break;
						
					case 3:
						
						System.out.println("Please Enter the Id :");
						int id=Integer.parseInt(br.readLine());
						ssi.removeStudent(id);
						break;
						
					case 4:
						System.out.println("Please Enter the Id :");
						int id1=Integer.parseInt(br.readLine());
						ssi.updateInfo(id1);
						
						break;
					case 5:
						System.out.println("Please Enter the Id :");
						int id2=Integer.parseInt(br.readLine());
						ssi.getInfo(id2);
						
						break;

					case 6:
						go=false;
						System.out.println("You have successfully Exit:");
						break;
						
					}
	        		
	        	}
	        	catch(Exception e) {
	        		System.out.println("Invalid Input Try with other");
	        		System.out.println(e.getMessage());
	        		
	        	}
	        	
	        	
	        	
	        	
        }
    }
}
