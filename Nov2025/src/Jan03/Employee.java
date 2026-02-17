package Jan03;

public class Employee {
    String name;
    String id;

    Employee(){

    }
    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    void work(){
        System.out.println("working");
    }
    void talk(){
        System.out.println("talking");
    }

    void withDrawSalary(){
        System.out.println("Salary withdraw");
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
