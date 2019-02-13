package io.javabrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication

public class CrudBackEndApplication
{ 
	

	public static void main(String[] args) {
		SpringApplication.run(CrudBackEndApplication.class, args);
	}
}
