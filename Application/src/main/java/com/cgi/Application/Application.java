package com.cgi.Application;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static HashMap<Long,Student> hm;
	public static void main(String[] args) {
		
		hm = new HashMap<Long,Student>();
		
		Student st = new Student("Aarti","Math");
		hm.put(new Long(st.getId()), st);
		
		SpringApplication.run(Application.class, args);
		
		Student st1 = new Student("Golu","Physics");
		hm.put(new Long(st1.getId()), st1);
	}

}

