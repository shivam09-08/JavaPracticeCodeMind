package SpringContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class SpringCore {
public static void main(String[] args) {
	
	ApplicationContext  cntxt = new ClassPathXmlApplicationContext("Beans.xml");
	
	
	Employee emp = cntxt.getBean(Employee.class);
	Employee emp1 = cntxt.getBean(Employee.class);
	emp1.setId(105);
	System.out.println(emp1);
	System.out.println(emp);
}
}
