package Dec20;

public class StudentMain {
    static int x = 10;
    public static void main(String[] args) {
        Student student = new Student("Tom");
        student.display();
//        String s = Student.course; // since course is static to the class we can access without obj

    }
}
