package Sorting;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] test = {12,35,25,74,43,2};
        int[] unsorted = {12,35,25,74,43,2};
        int n = test.length;

        for(int i = 1; i < n; i++){
            int j = i-1;
            int current = test[i];
            while(j>=0 && test[j] > current){
                test[j+1] = test[j];
                j--;
            }
            test[j+1] = current;

        }
        System.out.println("Unsorted: " + Arrays.toString(unsorted));
        System.out.println("Sorted: " + Arrays.toString(test));
    }
}
