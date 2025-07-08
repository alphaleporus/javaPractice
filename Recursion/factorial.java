package Recursion;

import java.util.Scanner;

public class factorial {
    static int factorialSolver(int num){
        if(num <=1)return 1;
        return num * factorialSolver(num-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate factorial: ");
        int num = scanner.nextInt();
        int factorial = factorialSolver(num);
        System.out.println("The factorial of "+ num + " is " + factorial );
    }
}
