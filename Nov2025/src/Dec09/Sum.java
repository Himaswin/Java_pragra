package Dec09;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nubmer");
        int input = sc.nextInt();

        int sum = 0;
        while(input > 0){
            sum += input%10;
            input /=10;
        }
        System.out.println(sum);

    }
}
