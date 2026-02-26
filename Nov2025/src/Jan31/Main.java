package Jan31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(6);
        list.add(7);

//        for(Integer i : list){
//            System.out.println(i);
//            if(i == 5){
//                list.remove(i);
//            }
//        }
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            Integer i = itr.next();
            if(i == 6){
                list.remove(i);
                System.out.println(list);
            }
        }
//        ArrayList<String> cities = new ArrayList<>();
//        cities.add("toronto");
//        cities.add("windsor");
////        System.out.println(cities);
//
//        ArrayList<String> countries = new ArrayList<>();
//        countries.add("Canada");
//        countries.addAll(1, cities);
//        System.out.println(countries);

//        int[] arr = {2, 4, 7, 9, 4, 1};
//        for(int i = 0; i < arr.length; i++){
//            for(int j = i; j < arr.length; j++){
//                if(arr[i] + arr[j] == 10){
//                    System.out.println(i +" " + j);;
//                }
//            }
//        }

    }
}
