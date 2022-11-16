/*
 * Author Name : M.Krishna.
 * Date: 16-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package Domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeImpl {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfiguration.class);
        Employee employee1 = (Employee) context.getBean("employeeBean1");
        System.out.println(employee1);
    }
}
