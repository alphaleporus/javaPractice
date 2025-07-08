package Recursion;

import java.util.Arrays;

public class reversedArray {
    static void reverseArray(int[] arr, int p1, int p2){
        if(p1>=p2)return;
        int temp = arr[p1];
        arr[p1]= arr[p2];
        arr[p2] =temp;
        reverseArray(arr, p1+1, p2 -1);
    }

    static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int num = 5;
        int[] arr =  {6, 5, 4, 3, 2, 1};
        reverseArray(arr, 0, (arr.length-1));
        printArray(arr);
    }
}