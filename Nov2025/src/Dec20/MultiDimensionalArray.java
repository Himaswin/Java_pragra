package Dec20;

import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[] arr = new int[5];

//        int[][] marr = new int[2][2];
//        marr[0][0] = 2;
//        marr[0][1] = 3;
//        marr[1][0] = 4;
//        marr[1][1] = 5;
//
//        for(int i = 0; i < marr.length; i++){
//            for(int j = 0; j < marr[i].length; j++){
//                System.out.print(marr[i][j] + " ");
//            }
//            System.out.println("");
//        }
        Scanner sc = new Scanner(System.in);
        int[][] marr2 = new int[3][3];
        for(int i = 0; i < marr2.length; i++){
            for(int j = 0; j < marr2[i].length; j++){
                marr2[i][j] = sc.nextInt();
            }
        }
        int[][] marr3 = new int[3][3];
        for(int i = 0; i < marr3.length; i++){
            for(int j = 0; j < marr3[i].length; j++){
                marr3[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < marr2.length; i++){
            for(int j = 0; j < marr2[i].length; j++){
                marr2[i][j] += marr3[i][j];
            }
        }
        for(int i = 0; i < marr2.length; i++){
            for(int j = 0; j < marr2[i].length; j++){
                System.out.print(marr2[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
