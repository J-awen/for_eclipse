package com.awen.util;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class DomainFactory implements InitializingBean, DisposableBean {
	private String message;
	
	@Autowired
	private DomainContext context;
	
	public DomainFactory() {
		System.out.println("DomainFactory:new----");
	}
	
	public void init(){
		System.out.println("DomainFactory:init----");
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void print(){
		System.out.println("DomainFactory:print----" + message);
		context.print();
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("DomainFactory:afterPropertiesSet----");		
	}
	
	@Override
	public void destroy(){
		System.out.println("DomainFactory:destroy----");
	}
}
