import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Fractional Knapsack ---");
        System.out.print("Enter the number of items: ");
        int n = scanner.nextInt();
        System.out.print("Enter the capacity of the knapsack: ");
        int capacity = scanner.nextInt();

        double[][] items = new double[n][3];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter profit for item " + (i + 1) + ": ");
            items[i][0] = scanner.nextDouble();
            System.out.print("Enter weight for item " + (i + 1) + ": ");
            items[i][1] = scanner.nextDouble();
            items[i][2] = items[i][0] / items[i][1];
        }

        Arrays.sort(items, Comparator.comparingDouble((double[] a) -> a[2]).reversed());

        double totalProfit = 0;
        int currentWeight = 0;

        for (int i = 0; i < n; i++) {
            if (currentWeight + items[i][1] <= capacity) {
                currentWeight += items[i][1];
                totalProfit += items[i][0];
            } else {
                double remainingCapacity = capacity - currentWeight;
                totalProfit += items[i][2] * remainingCapacity;
                break;
            }
        }
        System.out.println("\nMaximum profit (Fractional): " + String.format("%.2f", totalProfit));
        scanner.close();
    }
}