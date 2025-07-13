package Sorting;

import java.util.Arrays;

public class recursiveBubbleSort {

    static void bubbleSort(int[] test , int n){
        if(n==1)return;
        for(int i = 0; i<n-1 ; i++){
            if(test[i]>test[i+1]){
                int temp= test[i];
                test[i] = test[i +1];
                test[i+1] = temp;
            }
        }
        bubbleSort(test, n-1);
    }
    public static void main(String[] args) {
        int[] test= {1,52,12,42,76,21};
        int[] unsorted= test.clone();
        int n = test.length;

        bubbleSort(test, n);
        System.out.println("Unsorted: " + Arrays.toString(unsorted));
        System.out.println("Sorted: " + Arrays.toString(test));
    }
}
