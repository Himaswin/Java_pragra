package Jan06;

public class Main {
    public static void main(String[] args){
        String s = "Java";
        s.concat("World");
//        System.out.println(s);

        String s1 = new String("Java");
//        System.out.println(s == s1);  // false because ==to check for the reference
//        System.out.println(s.equals(s1)); // true check the value itself


        Student student = new Student("Tom");
//        System.out.println(student);//tom, memory address

        Area area = new Area();
        System.out.println(area.area(4));
        System.out.println(area.area(3, 5));
    }
}
