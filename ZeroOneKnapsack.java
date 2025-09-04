import java.util.Scanner;

public class ZeroOneKnapsack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- 0/1 Knapsack ---");
        System.out.print("Enter the number of items: ");
        int n = scanner.nextInt();
        System.out.print("Enter the capacity of the knapsack: ");
        int capacity = scanner.nextInt();

        int[] profits = new int[n];
        int[] weights = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter profit for item " + (i + 1) + ": ");
            profits[i] = scanner.nextInt();
            System.out.print("Enter weight for item " + (i + 1) + ": ");
            weights[i] = scanner.nextInt();
        }

        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= capacity; w++) {
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(profits[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        System.out.println("\nMaximum profit (0/1): " + dp[n][capacity]);
        scanner.close();
    }
}
