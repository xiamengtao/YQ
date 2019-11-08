import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class DemoTest {
   @Test
    public void show(){
        Logger logger = Logger.getLogger("DemoTest.class");
        logger.info("类信息");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        person person = (person) context.getBean("person");
        person.showInfo();
        person person1 = (person) context.getBean("person1");
        person1.showInfo();

    }
}
