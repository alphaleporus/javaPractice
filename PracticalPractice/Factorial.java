package PracticalPractice;

import java.util.Scanner;

public class Factorial {
    static int recursive(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*recursive(n-1);
        }
    }

    static int iterative(int n){
        int fact = 1;
        for(int i =1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }


    public static void main(String[] args) {
        System.out.print("Enter: ");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println("Iterative approach: " + iterative(n));
        System.out.println("Recursive approach " + recursive(n));
    }
}
