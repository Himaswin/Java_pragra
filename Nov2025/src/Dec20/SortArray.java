package Dec20;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int [] arr = {12, 1, 43, 56, 7};

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
