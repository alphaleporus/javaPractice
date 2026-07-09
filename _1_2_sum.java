import java.util.HashMap;
public class _1_2_sum {
    public int[] twoSum(int[]nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i= 0; i<nums.length; i++){
            int compelement = target - nums[i];
            if(map.containsKey(compelement)){
                return new int[]{map.get(compelement), i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
        
    }
}