package Dec20;

public class Student {

    String name;
    static String course = "java";

    public Student(String name) {
        this.name = name;
    }

    void display(){
//        System.out.println(name);
        System.out.println(course);
    }
     {
        System.out.print("inside instance block\n");
    }
    static {
        System.out.print("inside static block\n");
    }
    public static void main(String[] args) {
//        Student.display(); //if this method is static
//        display(); //when static and in same class
        Student student = new Student("bro");
        student.display();


    }
}
