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
        Employee employee1 = (Employee) context.getBean("empBean1");
        System.out.println(employee1);
        Employee employee2 = (Employee) context.getBean("empBean3");
        System.out.println(employee2);
        Employee employee3 = (Employee) context.getBean("empBean4");
        System.out.println(employee3);

    }
}
