package com.ict.ex03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ict/ex03/AOP.xml");
		Person person = (Person)context.getBean("boy");
		// person.play();
		person.doSmoting();
		
	}
}
