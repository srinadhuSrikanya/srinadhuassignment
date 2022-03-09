package com.java.bank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class One {  

	public static void main( String[] args )
    {
    	ApplicationContext applicationcontext=new ClassPathXmlApplicationContext("Bean.xml");  
        ActBankC obj=(ActBankC)applicationcontext.getBean("obj");  
        obj.withdraw();     
        }

}
