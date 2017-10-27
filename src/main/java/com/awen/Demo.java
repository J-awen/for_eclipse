package com.awen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.awen.util.DomainFactory;

public class Demo {

	public static void main(String[] args) {
		System.out.println("abbbbc".replaceAll("^a[abc]*c$", "*"));
		Pattern pattern = Pattern.compile("^a[abc]*c$");
		Matcher matcher = pattern.matcher("abbbbc");
		boolean result = matcher.find();
	}

	@Test
	public void test1() {
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		DomainFactory obj = (DomainFactory) factory.getBean("domainFactory");
		obj.getMessage();
	}

	@Test
	public void test2() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		DomainFactory obj = (DomainFactory) context.getBean("domainFactory");
		obj.getMessage();
	}
}
