package Sorting;

import java.util.Arrays;

public class bubbleSortPractice {
    public static void main(String[] args) {
        int[] test = {12,24,15,1,72,43};
        int[] unsorted ={12,24,15,1,72,43};
        int n = test.length;

        for(int i = n-1; i>0; i--){
            boolean didSwap = false;
            for(int j =0; j<i ; j++){
                if(test[j]>test[j+1]){
                    didSwap =true;
                    int temp = test[j];
                    test[j] = test[j+1];
                    test[j+1] = temp;
                }
            }
            if(!didSwap){
                break;
            }
        }

        System.out.println("Unsorted: " + Arrays.toString(unsorted));
        System.out.println("Sorted: " + Arrays.toString(test));
    }
}
