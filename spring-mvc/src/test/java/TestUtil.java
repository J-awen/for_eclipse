

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.awen.mvc.util.DomainContext;
import com.awen.mvc.util.DomainFactory;

public class TestUtil {
	
	private ApplicationContext content;

	@Test
	public void test1() {
		content = new ClassPathXmlApplicationContext("beans.xml");
		DomainContext domainContext = (DomainContext) content.getBean("domainContext");
		domainContext.print();
		
		DomainFactory domainFactory = (DomainFactory) content.getBean("domainFactory");
		domainFactory.setMessage("11111");
		domainFactory.print();
		domainFactory = (DomainFactory) content.getBean("domainFactory");
		domainFactory.print();
	}
}
