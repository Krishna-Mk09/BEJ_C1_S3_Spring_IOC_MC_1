/*
 * Author Name : M.Krishna.
 * Date: 16-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package Domain;

public class Department {
    private int departmentCode;
    private String departmentType;

    public Department(int departmentCode, String departmentType) {
        this.departmentCode = departmentCode;
        this.departmentType = departmentType;
    }

    public Department() {
    }

    public int getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(int departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(String departmentType) {
        this.departmentType = departmentType;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentCode=" + departmentCode +
                ", departmentType='" + departmentType + '\'' +
                '}';
    }
}
