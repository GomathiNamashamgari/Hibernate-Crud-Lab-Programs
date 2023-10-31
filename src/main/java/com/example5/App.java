package com.example5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example5.model.Student;

public class App 
{
	public static void main( String[] args )
    {
    	 Configuration cfg=new Configuration();
         cfg.configure("hibernate.cfg.xml");
         SessionFactory factory=cfg.buildSessionFactory();
         Session session=factory.openSession();
         try 
         {
        	//Insert Student details into user table
        	 /*
        	 for(int i=1;i<=10;i++)
        	 {  		
        		Student s1=new Student();
        		s1.setName("student"+i);
        		s1.setAge(18+i);
        		session.save(s1);
  	         }
  	         */
        	 
        	 
        	 //Retrieve the details of a Student
        	 
        	 
        	 Student s1=session.get(Student.class, 9);
        	 System.out.println("student name:"+s1.getName());
        	 System.out.println("student Age:"+s1.getAge());
        	
        	 
        	 //Update the User
        	 /*
        	 Student s1=session.get(Student.class, 14);
        	 s1.setAge(18);
        	 session.update(s1);
        	 session.save(s1);
        	 */
        	 
        	 //Delete the User
        	 
        	// Student s1=session.get(Student.class, 12);
        	 //session.delete(s1);
        	 
         	
         	session.beginTransaction();
         	
         	session.getTransaction().commit();
         	
    
         }
         catch(Exception e)
         {
         	e.printStackTrace();
         }
         finally 
         {
          	session.close();
          	factory.close();
          }
         
      }
 }

