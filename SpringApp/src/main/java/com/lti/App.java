package com.lti;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.config.StudentConfiguration;
import com.lti.pojo.Address;
import com.lti.pojo.Product;
import com.lti.pojo.Student;

public class App 
{
    public static void main( String[] args )
    {	
    	/*
        ApplicationContext context = new ClassPathXmlApplicationContext("myBeans.xml");
        Student s1 = (Student) context.getBean("StudentBean");
        System.out.println(s1.getStudentId());
        System.out.println(s1.getStudentName());
        
        s1.setStudentName("Chitra");

        System.out.println(s1.getStudentName());
        
        Address a1 = (Address) context.getBean("AddressBean");
        System.out.println(a1.getStreet());
        System.out.println(a1.getCity());
        
        a1.setCity("Hyderabad");
        a1.setStreet("Kothaguda 'X' road");
        System.out.println(a1.getCity());
        System.out.println(a1.getStreet());
        
        System.out.println("Address: "+s1.getAddress());
       */ 
        /*
    	 ApplicationContext context = 
    			 new AnnotationConfigApplicationContext(StudentConfiguration.class);
         Student s1 = context.getBean(Student.class);
         System.out.println("Student ID :"+s1.getStudentId());
         System.out.println("Student Name :"+s1.getStudentName());   
         System.out.println("Address :"+s1.getAddress());

         Address obj= (Address) context.getBean(Address.class);
         obj.setStreet("12th");
         s1.setAddress(obj);

         System.out.println(s1.getAddress());
		*/
    	
    	
    	/*
    	//SINGLETON AND PROTOTYPE
    	 ApplicationContext context = new ClassPathXmlApplicationContext("myBeans.xml");
         Product p1 = (Product) context.getBean("product");
        p1.setPname("Toothpaste");
        p1.setPrice(150);
        p1.setProdid("p001");
        
        Product p2 = (Product) context.getBean("product");
        p2.setPname("Brush");
        p2.setProdid("p002");
        p2.setPrice(80);
        
        Product p3 = (Product) context.getBean("product");
        p3.setPname("Mouth Wash");
        p3.setProdid("p003");
        p3.setPrice(250);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        */
    	
    	
    	 ApplicationContext context = 
    			 new AnnotationConfigApplicationContext(StudentConfiguration.class);
         Product p1 = (Product)context.getBean(Product.class);
         p1.setProdid("p001");
         p1.setPname("Brush");
         p1.setPrice(100);
         
         Product p2 = (Product) context.getBean(Product.class);
         p2.setProdid("p002");
         p2.setPname("Paste");
        
         Product p3 = (Product) context.getBean(Product.class);

         System.out.println(p1);
         System.out.println(p2);  
         System.out.println(p3);

    	
    }
}
