package Sorting;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class mergeSort {
    static void merge(int[] nums, int low, int high, int mid) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp.add(nums[left]);
                left++;
            } else {
                temp.add(nums[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(nums[left]);
            left++;
        }
        while (right <= high) {
            temp.add(nums[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            nums[i] = temp.get(i - low);
        }
    }

    static void mergeSort(int[] nums, int low, int high) {
        if (low >= high) return;
        int mid = (high + low) / 2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);
        merge(nums, low, high, mid);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int low = 0;
        int high = nums.length - 1;

        System.out.println("Original array: " + Arrays.toString(nums));

        mergeSort(nums, low, high);

        System.out.println("Sorted array: " + Arrays.toString(nums));

        scanner.close();
    }
}