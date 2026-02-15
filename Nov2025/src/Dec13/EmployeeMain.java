package Dec13;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "karan";
        employee.employeeId = 123;
        employee.dept = "Dev";
        employee.salary = 50000;

        employee.employeeDetails();
    }
}
