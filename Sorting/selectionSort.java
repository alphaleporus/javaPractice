package Sorting;

public class selectionSort {
    public static void main(String[] args) {
        int[] test = {23,12,53,13,74,1};
        int[] unsorted ={23,12,53,13,74,1};
        int n = test.length;
        for(int i = 0; i <= n-2; i++){
            int minIndex = i ;
            for(int j = i; j <= n-1; j++){
                if(test[minIndex] > test[j]){
                    minIndex = j;
                }
            }
            int temp = test[minIndex];
            test[minIndex] = test[i];
            test[i] = temp;
        }
        System.out.print("Sorted Array: ");
        for(int num: test){
            System.out.print(num + ",");
        }
        System.out.println();
        System.out.print("Unsorted Array: ");
        for(int num:unsorted){
            System.out.print( num + ",");
        }
    }
}
