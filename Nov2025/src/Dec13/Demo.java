package Dec13;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4,}; /// fixed size;
        int[] arr1 = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i< arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
//        int len = arr.length;
//        System.out.println(len);
        for(int a: arr1){
            System.out.println(a);
        }
    }
}
