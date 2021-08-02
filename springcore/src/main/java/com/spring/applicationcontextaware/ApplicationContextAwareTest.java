package com.spring.applicationcontextaware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
public class ApplicationContextAwareTest implements ApplicationContextAware  {
	ApplicationContext context;
	public ApplicationContext getContext() {
		return context;
	}
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.context=context;
	}
	
}