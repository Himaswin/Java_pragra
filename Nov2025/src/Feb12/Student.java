package Feb12;

import java.util.Objects;

public class Student {
    String name;
    String email;
    String phoneNo;

    public Student(String name, String email, String phoneNo) {
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(email, student.email) && Objects.equals(phoneNo, student.phoneNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, phoneNo);
    }
}
