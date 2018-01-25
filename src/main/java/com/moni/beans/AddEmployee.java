package com.moni.beans;

import static org.testng.Assert.assertEquals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class AddEmployee {

	@Test
	public void testEmployee() {
		String confFile = "applicationContext.xml";

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(confFile);
		Employee empBean = (Employee) context.getBean("myBean2");
		
		empBean.setEmpId(12);
		empBean.setEmpName("MR");
		
		System.out.println(empBean.getEmpId());
		System.out.println(empBean.getEmpName());
		
		assertEquals(empBean.getEmpId(), 12, "Emp id not matching");
		assertEquals(empBean.getEmpName(), "MR", "Emp name not maching");
		
	}

}
