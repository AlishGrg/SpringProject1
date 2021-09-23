package com.lti.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.lti.pojo.Address;
import com.lti.pojo.Product;
import com.lti.pojo.Student;

@Configuration
public class StudentConfiguration {
	@Bean
	public Address getAddress() {
		Address ad =  new Address();
		ad.setCity("Mumbai");ad.setStreet("Mahape Shil Road");
		return ad;
	}
	
	@Bean
    public Student getStudent()
    {
        Student s1=new Student();
        s1.setStudentId(101);
        s1.setStudentName("Jack");
        s1.setAddress(getAddress());
        return s1;
    }
	
	@Bean 
	@Scope("prototype")
	public Product getProduct() {
		return new Product();
	}

}
