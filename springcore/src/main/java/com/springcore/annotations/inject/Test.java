package com.springcore.annotations.inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/annotations/inject/autowiringconfig.xml");
		Employee emp=(Employee) context.getBean("emp");
		System.out.println(emp);
	}

}
