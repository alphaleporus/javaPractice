import java.util.Arrays;

public class leetcod128 {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int count=1;
        int max = 1;
        for(int i = 0 ; i<nums.length-1 ; i++){
            if(nums[i]+1 == nums[i+1]){
                count++;
            }
            if(nums[i]==nums[i+1])continue;
            if(nums[i]+1 != nums[i+1]) count = 1;

            max = Math.max(count, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,2};
        leetcod128 obj = new leetcod128();
        System.out.println(obj.longestConsecutive(nums));
    }
}
