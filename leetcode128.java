import java.util.Arrays;

public class leetcode128 {
    public static int longestConsecutive(int[] nums) {
        int length = 1;
        int max = 1;
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        for(int i = 0; i< nums.length-1; i++){
            if(nums[i+1]==nums[i]){
                continue;
            }
            if(nums[i+1]==nums[i]+1){
                length+=1;
            }
            max = Math.max(length,max);
            if(nums[i+1]!=nums[i]+1){
                length=1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[]nums = {1,0,1,2};
        int solution = longestConsecutive(nums);
        System.out.println(solution);
    }
}
