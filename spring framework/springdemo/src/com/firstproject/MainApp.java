package com.firstproject;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext Context=new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj=(HelloWorld)Context.getBean("helloworld");
		obj.method();
		

	} 

}
