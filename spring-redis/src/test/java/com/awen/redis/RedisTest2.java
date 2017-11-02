package com.awen.redis;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sun.reflect.Reflection;

import com.awen.redis.dao.IUserDao;
import com.awen.redis.entity.User;

/**
 * 测试
 * 
 * @author http://blog.csdn.net/java2000_wl
 * @version <b>1.0</b>
 */
public class RedisTest2 {

	/**
	 * 新增 <br>
	 * ------------------------------<br>
	 */
	@Test
	public void testAddUser() {
		try {
			Thread.sleep(1000);
			Class<?> caller = Reflection.getCallerClass();
			Class<?> ageClass = Class.forName("");
			ClassLoader.getSystemClassLoader().loadClass("Age");
		} catch (NoClassDefFoundError e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println();
		}
		/*
		 * ClassLoader classLoader = UserDao.class.getClassLoader(); ClassLoader
		 * classLoader2 = classLoader.getClass().getClassLoader(); try { Class cls =
		 * Class.forName("com.awen.redis.dao.UserDao"); } catch
		 * (ClassNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
		IUserDao userDao = (IUserDao) context.getBean("userDao");
		User user = new User();
		user.setId("user1");
		user.setName("java2000_wl");
		boolean result = userDao.add(user);
		Assert.assertTrue(result);

	}
}