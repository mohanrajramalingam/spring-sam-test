package com.moni.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		String confFile = "applicationContext.xml";

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(confFile);
		SpringFirstTest helloWorldBean = (SpringFirstTest) context.getBean("myBean1");
		helloWorldBean.testMe();
	}
}