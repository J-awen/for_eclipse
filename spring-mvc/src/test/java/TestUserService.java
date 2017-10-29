

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.awen.mvc.service.UserService;

public class TestUserService{  
  
    private static UserService userService;  
      
    @BeforeClass  
    public static void init(){  
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext-jotm.xml");  
        userService = (UserService)app.getBean("userService");  
    }  
      
    @Test  
    public void save(){  
        System.out.println("begin...");  
        try{  
            userService.saveUser();  
        }catch(Exception e){  
            System.out.println(e.getMessage());  
        }  
        System.out.println("finish...");  
    }  
      
}  