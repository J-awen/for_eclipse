package com.awen.mvc.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {
	@Test
	public void testConnect() {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml","applicationContext-data.xml"});
		UserDaoImpl userDao = (UserDaoImpl) context.getBean("userDaoImpl");
		userDao.find();
	}
	
	@Test
	public void testConnect2() {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml","applicationContext-data.xml"});
		UserDaoImpl userDao = (UserDaoImpl) context.getBean("userDaoImpl");
		userDao.find();
	}
}
