package Jan27;

public final class Employee1 {
    private final String name;
    private final int empID;
    private final double salary;

    public Employee1(String name, int empID, double salary) {
        this.name = name;
        this.empID = empID;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getEmpID() {
        return empID;
    }

    public double getSalary() {
        return salary;
    }
}
