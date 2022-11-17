/*
 * Author Name : M.Krishna.
 * Date: 16-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package Domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * The main method of the EmployeeImpl class creates an ApplicationContext object using the
 * AnnotationConfigApplicationContext class.
 *
 * The AnnotationConfigApplicationContext class is used to create an ApplicationContext object using the configuration
 * class.
 *
 * The configuration class is passed as an argument to the constructor of the AnnotationConfigApplicationContext class.
 *
 * The getBean() method of the ApplicationContext class is used to get the bean object.
 *
 * The getBean() method takes the bean id as an argument and returns the bean object.
 *
 * The bean id is the name of the bean.
 *
 * The bean id is specified using the @Bean annotation.
 *
 * The @Bean annotation is used to create a bean object.
 *
 * The @Bean annotation is used with the method.
 *
 * The method name is the bean id.
 *
 * The method returns the bean object.
 *
 * The bean object
 */
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
