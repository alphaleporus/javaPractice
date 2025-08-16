import java.util.Scanner;

public class BinarySearchDivideAndConquer {

    public static int binarySearch(int[] arr, int low, int high, int key) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                return binarySearch(arr, low, mid - 1, key);
            }
            return binarySearch(arr, mid + 1, high, key);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sorted array elements separated by spaces:");
        String input = scanner.nextLine();

        String[] numStrings = input.split(" ");
        int[] arr = new int[numStrings.length];
        for (int i = 0; i < numStrings.length; i++) {
            arr[i] = Integer.parseInt(numStrings[i]);
        }

        System.out.println("Enter the element to search for:");
        int key = scanner.nextInt();

        int result = binarySearch(arr, 0, arr.length - 1, key);

        if (result == -1) {
            System.out.println("Element not present in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
        scanner.close();
    }
}