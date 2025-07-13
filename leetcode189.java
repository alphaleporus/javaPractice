import java.util.Arrays;

public class leetcode189 {
    static void rotate(int[] nums, int k) {
        k%= nums.length;
        int count=0;
        while (count != k) {
            int n = nums.length;
            int last = nums[nums.length - 1];
            for (int i = n - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = last;
            count++;
        }
    }
    public static void main (String[]args){
            int[] nums = {1, 2, 3, 4, 5, 6, 7};
            int k = 3;
            rotate(nums, k);
            System.out.println(Arrays.toString(nums));
        }
    }
