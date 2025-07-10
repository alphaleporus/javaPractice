package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeSort {
    static void merge(int[]nums, int low , int high, int mid) {
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


    static void mergeSort(int[] nums, int low, int high){
        if(low>=high)return;
        int mid = (high + low) /2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid+1, high);
        merge(nums, low, high, mid);

    }
    public static void main(String[] args) {
        int[]nums = {5,4,3,2,1};
        int low = 0;
        int high = nums.length-1;
        mergeSort(nums, low, high);
        System.out.println("Sorted: " + Arrays.toString(nums));
    }
}