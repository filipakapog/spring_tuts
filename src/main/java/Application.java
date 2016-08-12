import com.pluralsight.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fghimpeteanu on 8/12/2016.
 */
public class Application {
    public static void main(String[] args) {
        //CustomerService customerService = new CustomerServiceImpl();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService service = applicationContext.getBean("foo", CustomerService.class);

        System.out.println(service.findAll().get(0));
    }
}
