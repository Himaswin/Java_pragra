package Dec13;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.firstName = "tom";
        student.lastName = "hardy";
        student.rollNo = 12;

//        student.displayDetails();

        Student harry = new Student();
        harry.firstName = "Harry";
        harry.lastName = "Potter";
        harry.rollNo = 13;

//        harry.displayDetails();
        harry.display("Donald", "bro");
    }
}
