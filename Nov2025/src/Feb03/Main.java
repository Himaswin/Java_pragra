package Feb03;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        System.out.println("arraylist : " + arrayList);

        TreeSet<Integer> linkedList = new TreeSet<>();
        Iterator<Integer> itr = arrayList.iterator();
        while(itr.hasNext()){
            linkedList.add(itr.next());
        }
        System.out.println(linkedList);

        Employee emp0 = new Employee("Tom", 1, 35000);
        Employee emp1 = new Employee("Tom", 1, 35000);
        Employee emp2 = new Employee("Harry", 2, 36000);
        Employee emp3 = new Employee("raj", 3, 37000);
        Employee emp4 = new Employee("raj", 4, 39000);
        Employee emp5 = new Employee("ramesh", 5, 65000);

        List<Employee> list = new ArrayList<>();
        list.add(emp0);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        System.out.println(list);

        Set<Employee> set = new HashSet<>(list);
        System.out.println(set);





//
//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(20);
//
//        Set<Integer> set = new HashSet<>();
//        set.add(10);
//        set.add(5);
//        set.add(10);
//        set.add(null);
//        System.out.println(set);
//
//        TreeSet<String> treeSet = new TreeSet<>();
//        treeSet.add("Java");
//        treeSet.add("Python");
//        treeSet.add("C");
//        treeSet.add("C#");
//        System.out.println(treeSet);
//



    }
}
