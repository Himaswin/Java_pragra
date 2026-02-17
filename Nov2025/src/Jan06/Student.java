package Jan06;

public class Student {

    String name;

    Student(String s){
        this.name = s;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
