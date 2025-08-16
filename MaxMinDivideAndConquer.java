import java.util.Scanner;

public class MaxMinDivideAndConquer {

    static class Pair {
        int max;
        int min;
    }

    static Pair findMaxMin(int[] arr, int low, int high) {
        Pair result = new Pair();
        if (low == high) {
            result.max = arr[low];
            result.min = arr[low];
            return result;
        }

        if (high == low + 1) {
            if (arr[low] > arr[high]) {
                result.max = arr[low];
                result.min = arr[high];
            } else {
                result.max = arr[high];
                result.min = arr[low];
            }
            return result;
        }

        int mid = low + (high - low) / 2;
        Pair leftResult = findMaxMin(arr, low, mid);
        Pair rightResult = findMaxMin(arr, mid + 1, high);

        result.max = Math.max(leftResult.max, rightResult.max);
        result.min = Math.min(leftResult.min, rightResult.min);

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array elements separated by spaces:");
        String input = scanner.nextLine();

        String[] numStrings = input.split(" ");
        int[] arr = new int[numStrings.length];
        for (int i = 0; i < numStrings.length; i++) {
            arr[i] = Integer.parseInt(numStrings[i]);
        }

        Pair maxMin = findMaxMin(arr, 0, arr.length - 1);
        System.out.println("Max: " + maxMin.max);
        System.out.println("Min: " + maxMin.min);

        scanner.close();
    }
}

