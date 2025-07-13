package Sorting;

import java.util.Arrays;

public class recursiveInsertionSort {
    static void insertionSort(int[] arr , int n){
        if(n<=1)return;

        insertionSort(arr, n-1);

        int last = arr[n-1];
        int j  = n-2;

        while(j>=0 && arr[j] > last){
            arr[j+1] = arr[j];
            j--;
        }

        arr[j+1] = last;
    }

    public static void main(String[] args) {
        int[]test = {21,42,53,12,76};
        int[]unsorted = test.clone();
        int n = test.length;

        insertionSort(test, n);

        System.out.println("Unsorted: "  + Arrays.toString(unsorted));
        System.out.println("Sorted: " + Arrays.toString(test));
    }

}
