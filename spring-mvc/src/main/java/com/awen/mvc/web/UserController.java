package com.awen.mvc.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.awen.mvc.util.AppContext;
import com.awen.mvc.util.AppContext2;
import com.awen.mvc.util.DomainContext;
import com.awen.mvc.util.DomainFactory;

@Controller
@RequestMapping("/user")
public class UserController implements ApplicationContextAware {
	private WebApplicationContext webApplicationContext;

	@Autowired
	private DomainFactory domainFactory;

	@Autowired
	private DomainContext domainContext;

	@RequestMapping(value = "main", method = RequestMethod.GET)
	public String main(Model model) {
		System.out.println("main----");
		ApplicationContext applicationContext = AppContext.getApplicationContext();
		ApplicationContext applicationContext2 = AppContext2.getApplicationContext();
		Object object = webApplicationContext.getBean("userController");
		Object object1 = webApplicationContext.getBean("domainFactory");
		Object object2 = applicationContext.getBean("domainFactory");
		Object object3 = webApplicationContext.getBean("domainContext");
		Object object4 = applicationContext.getBean("domainContext");
		domainFactory.print();
		String[] str1 = webApplicationContext.getBeanDefinitionNames();
		String[] str2 = webApplicationContext.getBeanNamesForAnnotation(Controller.class);
		String[] str3 = webApplicationContext.getBeanNamesForAnnotation(Service.class);

		String[] str4 = applicationContext.getBeanDefinitionNames();
		String[] str5 = applicationContext.getBeanNamesForAnnotation(Controller.class);
		String[] str6 = applicationContext.getBeanNamesForAnnotation(Service.class);

		return "main";
	}

	@RequestMapping(value = "main2", method = RequestMethod.GET)
	public String main2(Model model) {
		HttpServletRequest req = this.getRequest();
		HttpSession session = req.getSession();
		session.setAttribute("name", "wangwenping");
		return "main";
	}

	public HttpServletRequest getRequest() {
		ServletRequestAttributes attrs = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		return attrs.getRequest();
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.webApplicationContext = (WebApplicationContext) applicationContext;
	}

}