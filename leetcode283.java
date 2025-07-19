import java.util.Arrays;

public class leetcode283 {
    public static void moveZeroes(int[] nums) {
        int insert = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[insert] = nums[i];
                insert++;
            }
        }
        while(insert< nums.length){
            nums[insert] = 0;
            insert++;
        }
    }
    public static void main(String[] args) {
        int[]nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
