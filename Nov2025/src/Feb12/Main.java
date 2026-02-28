package Feb12;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<Student, Integer> marks = new HashMap<>();
        marks.put(new Student("Harry", "email", "456"), 90);
        marks.put(new Student("ram", "email1", "456f"), 80);

        System.out.println(marks.get(new Student("Harry", "email", "456")));



        ICalculator cal = new ICalculator() { // anonymous inner class
            @Override
            public int add(int a, int b) {
                return 0;
            }
        };
        ICalculator cal2 = ( a,  b) -> a+b;
        cal2.add(5,5);
        System.out.println(cal2);
    }
}
