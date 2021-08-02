package com.spring.applicationcontextaware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SpringTest {
	public static void main(String[] args) {
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("com/spring/applicationcontextaware/app-config.xml");
		ApplicationContextAwareTest appcontext= (ApplicationContextAwareTest)context.getBean("appcontext");
		ApplicationContext appCon =appcontext.getContext();
		A a= (A)appCon.getBean("testA");
		a.doTask();
		context.registerShutdownHook();
	}
} 