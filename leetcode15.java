import java.util.*;

public class leetcode15 {
    public static List<List<Integer>> threeSum(int[] nums) {
//        O(N^3) - NOT EFFICIENT - TLE
//        Set<List<Integer>> result = new HashSet<>();
//        for(int i = 0; i < nums.length; i++){
//            for(int j = i + 1; j < nums.length; j++){
//                for(int k = j + 1; k < nums.length; k++){
//                    if(nums[i] + nums[j] + nums[k] == 0){
//                        List<Integer> temp = new ArrayList<>();
//                        temp.add(nums[i]);
//                        temp.add(nums[j]);
//                        temp.add(nums[k]);
//                        Collections.sort(temp);
//                        result.add(temp);
//                    }
//                }
//            }
//        }
//        return new ArrayList<>(result);

        Arrays.sort(nums);
        List<List<Integer>>result = new ArrayList<>();
        for(int i =0; i<nums.length-2 ; i++){
            int left = i+1;
            int right = nums.length-1;
            if(i>0 && nums[i]==nums[i-1]) continue;
            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left<right && nums[left] == nums[left+1]) left++;
                    while(left<right && nums[right] == nums[right-1]) right--;
                    left++;
                    right--;
                }
                else if(sum<0) left++;
                else right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] sample = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(sample);
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}
