import java.util.Arrays;

public class leetcode31 {
    public static void nextPermutation(int[] nums) {
        int index = -1;
        for(int i = nums.length-2 ; i>=0; i--){
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            for(int i = 0; i <= (nums.length/2)-1; i++){
                int temp = nums[i];
                nums[i] = nums[nums.length-1-i];
                nums[nums.length-1-i] = temp;
            }
            return;
        }
        for(int j = nums.length-1; j>index;j--){
            if(nums[j]>nums[index]){
                int temp = nums[j];
                nums[j] = nums[index];
                nums[index] = temp;
                break;
            }
        }
        int left = index+1;
        int right = nums.length-1;
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
