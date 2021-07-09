package com.ict.ex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ict/ex04/AOP.xml");
		Person person = (Person)context.getBean("girl");
		// person.play();
		person.doSmoting();
		
	}
}
