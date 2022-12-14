/*
 * Author Name : M.Krishna.
 * Date: 16-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */

package Domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private int employeeId;
    private String employeeName;
    private int employeeAge;
    private String position;
    private String Address;
    private Department employeeDepartment;

    public Employee() {
    }

    // Injecting the dependency of Department class into Employee class.
    @Autowired
    public Employee(Department employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public Employee(int employeeId, String employeeName, int employeeAge, String position, String address) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.position = position;
        Address = address;

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Department getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(Department employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeId=" + employeeId + ", employeeName='" + employeeName + '\'' + ", employeeAge=" + employeeAge + ", position='" + position + '\'' + ", Address='" + Address + '\'' + ", employeeDepartment=" + employeeDepartment + '}';
    }
}
