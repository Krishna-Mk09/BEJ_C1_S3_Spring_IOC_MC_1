/*
 * Author Name : M.Krishna.
 * Date: 16-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package Domain;

import org.springframework.context.annotation.Bean;

public class EmployeeConfiguration {
    @Bean("empBean1")
    public Employee getEmployee1Details() {
        Employee employee2 = new Employee(getDepartment1());
        employee2.setEmployeeAge(25);
        employee2.setEmployeeName("Vamshi");
        employee2.setEmployeeId(1001);
        employee2.setPosition("Team-lead");
        employee2.setAddress("90-23-3121/kolkata");
        return employee2;
    }

    @Bean("empBean3")
    public Employee getEmployee2Details() {
        Employee employee3 = new Employee(getDepartment1());
        employee3.setEmployeeAge(25);
        employee3.setEmployeeName("Vamshi");
        employee3.setEmployeeId(1001);
        employee3.setPosition("Team-lead");
        employee3.setAddress("90-23-3121/kolkata");
        return employee3;
    }

    @Bean("empBean4")
    public Employee getEmployee4Details() {
        Employee employee4 = new Employee(getDepartment1());
        employee4.setEmployeeAge(25);
        employee4.setEmployeeName("Vamshi");
        employee4.setEmployeeId(1001);
        employee4.setPosition("Team-lead");
        employee4.setAddress("90-23-3121/kolkata");
        return employee4;
    }

    @Bean
    public Department getDepartment1() {
        return new Department(1111, "IT");
    }
}
