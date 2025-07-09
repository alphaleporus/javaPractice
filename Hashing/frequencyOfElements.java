package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class frequencyOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements you wish to enter: ");
        int in  = scanner.nextInt();
        int[] input = new int[in];
        for(int i = 0; i<in; i++){
            System.out.print("Enter a element: ");
            input[i] = scanner.nextInt();
        }
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for(int i = 0 ; i < in; i++){
            int element = input[i];
            frequency.put(element , frequency.getOrDefault(element, 0)+1);
        }

        while(true){
            System.out.println("Frequency of which element(-1 to exit): ");
            int check = scanner.nextInt();
            if(check == -1)break;
            if (frequency.containsKey(check)){
                System.out.println(check + " appears " + frequency.get(check) + " times...");
            }
            else{
                System.out.println("Element doesn't exist in the array.");
            }
        }
    }
}

