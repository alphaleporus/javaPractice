package PracticalPractice;

import java.util.Scanner;

public class fibonacci {
    static int recursive(int n){
        if(n<=1){
            return n;
        }
        return recursive(n-1)+ recursive(n-2);

    }

    static void iterative(int n){
        int first = 1;
        int second = first;
        for(int i = 0; i <= n; i++){
            System.out.print(first + ", ");
            int next = first+second;
            first = second;
            second=next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci till: ");

        int n = scanner.nextInt();

        System.out.print("Iterative approach: ");
        iterative(n);

        System.out.println("recursive approach: ");

        for(int i=1; i<=n+1; i++){
            System.out.print(recursive(i)+ ", ");
        }
    }
}
