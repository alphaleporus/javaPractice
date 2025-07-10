package Hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class leetcode1838 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<>();
        while(true){
            System.out.println("Enter element to add(-1 to quit): ");
            int in  = scanner.nextInt();
            if(in == -1)break;
            input.add(in);
        }
        System.out.println("Enter k: ");
        int k = scanner.nextInt();
        Collections.sort(input);
        int maxElement = input.get(input.size()-1);

        for(int i = input.size()-2; i >=0 ; i--){
            int diff = maxElement - input.get(i);
            if(diff <= k){
                input.set(i, maxElement);
                k-=diff;
            }else{
                input.set(i , input.get(i) + k);
                k = 0;
            }
        }
        int counter = 0;
        for(int j = 0 ; j<input.size(); j++){
            if(maxElement == input.get(j)){
                counter++;
            }
        }
        System.out.println("The Frequency of the Most Frequent Element " + maxElement + " is " + counter);
        System.out.println("Final array is " + input);
    }
}
