package Jan24;

public class Student<Student> {

    Student name;
    Student rollNo;
    Student courseName;

    public Student(Student name, Student rollNo, Student courseName) {
        this.name = name;
        this.rollNo = rollNo;
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", rollNo=" + rollNo +
                ", courseName=" + courseName +
                '}';
    }
}
