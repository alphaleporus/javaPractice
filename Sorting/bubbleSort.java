package Sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] test = {12,24,15,1,72,43};
        int[] unsorted ={12,24,15,1,72,43};
        int n = test.length;

        for(int i = n-1; i>=0; i--){
            for(int j = 0; j<i; j++){
                if(test[j]>test[j+1]){
                    int temp = test[j];
                    test[j] = test[j+1];
                    test[j+1] = temp;
                }
            }
        }
        System.out.println("Unsorted array: " + Arrays.toString(unsorted));

        System.out.println("Sorted array: " + Arrays.toString(test));
    }
}
