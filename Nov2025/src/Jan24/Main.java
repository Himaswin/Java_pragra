package Jan24;

import com.sun.jdi.Value;

import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        Bank bank = new Bank(1000);
//
//        System.out.println("initial " + bank.getBalance());
//        try {
//            System.out.println("after withdraw " + bank.withDraw(5000));
//        }catch(RuntimeException e){
//            e.printStackTrace();
//        }
//        System.out.println("balance " + bank.getBalance());
//        System.out.println("deposit " + bank.deposit(300));
//        DrivingTest drivingTest = new DrivingTest();
//        try{
//            drivingTest.checkAge(15);
//        }catch (LegalageException e){
//            e.printStackTrace();
//        }
//
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(1);
//        System.out.println(arrayList);

//        Container container = new Container("I1", "I2");
//        container.printItems();
//        Container<Integer> cn = new Container<>(12,13);
//        cn.printItems();


        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("ash", 1234, "blabla"));
        students.add(new Student("roop", 1235, "math"));
        students.add(new Student<>("ranke", 1244, "science"));
        System.out.println(students);

        ArrayList<Record> name = new ArrayList<>();
        name.add(new Record("ropu"));
        name.add(new Record("ramesh"));
        System.out.println(name);

        ArrayList<Record> roll = new ArrayList<>();
        roll.add(new Record(123));
        roll.add(new Record(124));
        System.out.println(roll);

        ArrayList<Record> percentage = new ArrayList<>();
        percentage.add(new Record(95.2));
        percentage.add(new Record(93.2));
        System.out.println(percentage);



    }
}
