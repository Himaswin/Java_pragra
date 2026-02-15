package Dec06;

import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter: \n");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b && b > c){
            System.out.println("largest is " + a);
        }
        else if(b > c && b > a){
            System.out.println("largest is " + b);
        }
        else{
            System.out.println("largest is " + c);
        }
    }
}
