package com.cgi.Application;

import java.util.HashMap;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/student")
public class StudentService {
	
	@RequestMapping(value="/", produces= {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public HashMap<Long, Student> getAllStudents()
	{
		return Application.hm;
	}

}
