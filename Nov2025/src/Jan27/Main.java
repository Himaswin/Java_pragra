package Jan27;

import Jan20.Array;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Employee emp = new Employee("sjslk", 123, 15000);
//
//        System.out.println(emp);
//        emp.setSalary(4000);
//        System.out.println(emp);
//
//        Employee1 emp2 = new Employee1("bob", 143, 10000);
//        System.out.println(emp2);
//        Employee1 emp1 = new Employee1("jack", 144, 35000);
//        System.out.println(emp1);

        List<Integer> list = new ArrayList<>(); //upcasting
            long start = System.nanoTime();
        for(int i = 0; i < 100; i++){
            list.add(i);
        }
        long end = System.nanoTime();
//        System.out.println(end-start);

        List<Integer> list2 = new ArrayList<>(100); //upcasting
        long start1 = System.nanoTime();
        for(int i = 0; i < 10; i++){
            list2.add(i);
        }
        Iterator<Integer> itr = list2.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        long end1 = System.nanoTime();
//        System.out.println(end1-start1);

        int[] arr = new int[100];
        long start2 = System.nanoTime();
        for(int i = 0; i < 100; i++){
            arr[i] = i;
        }
        long end2 = System.nanoTime();
//        System.out.println(end2-start2);

        List<String> list1 = new ArrayList<>();
        list1.add("bro");
        list1.add("code");
//        System.out.println(list1);
    }
}
