package PracticalPractice;

import java.util.Scanner;

public class matrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the first matrix(A): ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix(A): ");
        int n = scanner.nextInt();

        System.out.print("Enter the number of rows for the second matrix(A): ");
        int p = scanner.nextInt();
        System.out.print("Enter the number of rows for the second matrix(A): ");
        int q = scanner.nextInt();
        System.out.println();

        //check
        if(n!=q){
            System.out.println("The number of columns in A are not equal to rows of B! Matrix Multiplication not possible...");
            return;
        }

        int[][]A = new int[m][n];
        int[][]B = new int[p][q];
        int[][]C= new int[m][q];

        System.out.println("Enter elements of A: ");
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println();

        System.out.println("Enter elements of B: ");
        for(int i = 0; i<p; i++){
            for(int j = 0; j<q; j++){
                B[i][j] = scanner.nextInt();
            }
        }
        System.out.println();


        for(int i = 0; i<p; i++){
            for(int j = 0; j<q; j++){
                C[i][j]=0;
                for(int k =0; k<p; k++){
                    C[i][j] += A[i][k]*B[k][j];
                }
            }
        }
        System.out.println();

        for(int i=0; i<m ;i++){
            for(int j=0; j<q; j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

    }

}
