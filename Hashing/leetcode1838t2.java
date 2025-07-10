package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class leetcode1838t2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4};
        int k = 5;
        long total=0;
        int left = 0;
        int maxFreq = 0;

        Arrays.sort(nums);

        for(int right =0; right < nums.length ;right++){
            total+= nums[right];
            long cost = (long) nums[right] * (right - left + 1) - (total);

            while(cost>k){
                total-=nums[left];
                left++;
                cost = (long) nums[right] * (right - left + 1) - (total);
            }

            maxFreq = Math.max(maxFreq, right - left +1);
            System.out.println("Window: [" + left + " to " + right + "], Total = " + total + ", Cost = " + cost + ", maxFreq = " + maxFreq);
        }

        System.out.println("Final Max Frequency: " + maxFreq);

    }
}
