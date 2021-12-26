import facade.BookingFacade;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class Runner {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        BookingFacade bookingFacade = applicationContext.getBean("bookingFacadeImpl", BookingFacade.class);
        Map<String, Map<String, String>> storage = applicationContext.getBean("storage", Map.class);

        System.out.println(storage);
    }
}
