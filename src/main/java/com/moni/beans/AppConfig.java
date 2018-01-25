package com.moni.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
//
//	@Bean(name="myBean1")
//	public SpringFirstTest getHelloWorld() {
//		return new SpringFirstTest();
//	}
	
	@Bean(name="myBean2")
	public Employee getEmployee() {
		return new Employee();
	}
}
