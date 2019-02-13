package com.cgi.Application;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@XmlRootElement(name="student")
public class Student {
	
	
	@XmlAttribute(name="id")
	private long id;
	@XmlElement
	private String name;
	@XmlElement
    private String subject;
		
	public Student() {
		}
	public Student(String name, String subject) {
		this.id= (new Date()).getTime();
		this.name = name;
		this.subject = subject;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	

}
