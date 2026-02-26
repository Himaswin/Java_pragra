package Jan31;

import java.util.Iterator;
import java.util.LinkedList;

public class EmployeeMain {
    public static void main(String[] args) {

        LinkedList<Employee> emp = new LinkedList<>();
        emp.add(0,new Employee("tom", 1, 150));
        emp.add(1,new Employee("Harry", 2, 60));
        emp.add(2,new Employee("Ram", 3, 165));

        Iterator<Employee> itr = emp.iterator();
        double max = 0;
        while(itr.hasNext()){
            Employee i = itr.next();
            if(i.getSalary() > max){
                max = i.getSalary();
            }
        }
//        double max = 0;
//        while(itr.hasNext()){
//            Employee i = itr.next();
//            if(i.salary > max){
//                max = i.salary;
//            }
//        }
        System.out.println(max);

    }
}
