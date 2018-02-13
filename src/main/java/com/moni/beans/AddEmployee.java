package com.moni.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddEmployee {

	public static void main(String args[]) {
		String confFile = "applicationContext.xml";

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(confFile);

		Employee empBean = (Employee) context.getBean("myBean2");
		empBean.setEmpId(12);
		empBean.setEmpName("MR");
		System.out.println(empBean.getEmpId());
		System.out.println(empBean.getEmpName());
		
		System.out.println("Jenkins test");
	}
}
