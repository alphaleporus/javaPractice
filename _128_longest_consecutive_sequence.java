import java.util.Arrays;

public class _128_longest_consecutive_sequence {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max =1;
        int count=1;
        if(nums.length==0){
            return 0;
        }
        for(int i =0; i<nums.length-2;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            if(nums[i]==nums[i+1]-1){
                count++;
            }
            if(nums[i]!=nums[i+1]-1){
                max = Math.max(count, max);
                count=1;
            }
            max = Math.max(count,max);
        }
        return max;
    }
}

