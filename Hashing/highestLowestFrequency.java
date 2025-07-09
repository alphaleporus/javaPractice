package Hashing;

import java.util.Scanner;
import java.util.TreeMap;

public class highestLowestFrequency {
    public static void main(String[] args) {
//        Taking the input
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many element do you wish to enter: ");
        int n = scanner.nextInt();
        int[] input = new int[n];
        for(int i = 0; i< n; i++){
            System.out.println("Enter the element: ");
            input[i] = scanner.nextInt();
        }

//        Pre-computing
        TreeMap<Integer, Integer> frequency = new TreeMap<>();
        for(int q : input){
            frequency.put(q , frequency.getOrDefault(q, 0)+1);
        }

//        sorting
        int maxFreq = 0;
        int minFreq = input.length;
        int maxElement = -1;
        int minElement = -1;

        for(int key:frequency.keySet()){
            int freq = frequency.get(key);
            if(maxFreq < freq){
                maxFreq = freq;
                maxElement = key;
            }
            if(minFreq > freq){
                minFreq = freq;
                minElement = key;
            }
        }

//        Printing results
        System.out.println("The highest occurring element is " + maxElement + " which occurred " + maxFreq +" times.");
        System.out.println("The lowest occurring element is " + minElement + " which occurred " + minFreq +" times.");

    }
}