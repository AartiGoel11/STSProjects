package io.javabrains.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
@RequestMapping("/hello")
public String hello()
{
	return "Hello";
}


@RequestMapping("/")
public String example()
{
	return "Hello, I am up";
}

}
