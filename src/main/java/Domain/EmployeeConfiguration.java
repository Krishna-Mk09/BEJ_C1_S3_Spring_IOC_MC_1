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
    public Employee getEmployee1Details(){
        Employee employee = new Employee();
        getEmployee1Details().setEmployeeId(1001);
        getEmployee1Details().setEmployeeName("vamshi");
        getEmployee1Details().setEmployeeAge(25);
        return employee;
    }
}
