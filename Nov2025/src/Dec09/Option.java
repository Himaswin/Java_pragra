package Dec09;

import java.util.Scanner;

public class Option {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        while(x != 3) {
            System.out.println("choose 1 or 2 or 3");
             x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Hello");
                    break;
                case 2:
                    System.out.println("Good evening");
                    break;
                case 3:
                    System.out.println("Exited");
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }
}
