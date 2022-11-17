/*
 * Author Name : M.Krishna.
 * Date: 16-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package Domain;

import org.springframework.context.annotation.Bean;

/**
 * The class EmployeeConfiguration contains the getEmployee1Details(), getEmployee2Details(), getEmployee4Details() and
 * getDepartment1() methods which return objects of type Employee and Department respectively
 */
public class EmployeeConfiguration {
    /**
     * The function getEmployee1Details() returns an object of type Employee
     *
     * @return Employee object
     */
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

    /**
     * The function getEmployee2Details() returns an object of type Employee
     *
     * @return Employee object
     */
    @Bean("empBean3")
    public Employee getEmployee2Details() {
        Employee employee3 = new Employee(getDepartment1());
        employee3.setEmployeeAge(27);
        employee3.setEmployeeName("Nani");
        employee3.setEmployeeId(1001);
        employee3.setPosition("fresher");
        employee3.setAddress("3426/kolkata");
        return employee3;
    }

    /**
     * The function getEmployee4Details() returns an object of type Employee
     *
     * @return Employee object
     */
    @Bean("empBean4")
    public Employee getEmployee4Details() {
        Employee employee4 = new Employee(getDepartment2());
        employee4.setEmployeeAge(25);
        employee4.setEmployeeName("krishna");
        employee4.setEmployeeId(1004);
        employee4.setPosition("Team-lead");
        employee4.setAddress("2345/121/kolkata");
        return employee4;
    }

    /**
     * The function getDepartment1() returns a new Department object with the values 1111 and "IT" for the departmentId and
     * departmentName fields respectively
     *
     * @return A new instance of Department
     */
    @Bean
    public Department getDepartment1() {
        return new Department(1111, "IT");
    }

    /**
     * The function getDepartment2() returns a new Department object with the values 1231 and "HR" for the id and name
     * fields respectively
     *
     * @return A new instance of Department
     */
    @Bean
    public Department getDepartment2() {
        return new Department(1231, "HR");
    }
}
