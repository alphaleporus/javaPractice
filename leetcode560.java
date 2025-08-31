import java.util.HashMap;

public class leetcode560 {
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum =0;
        HashMap<Integer, Integer> frequencies = new HashMap<>();
        frequencies.put(0,1);
        for(int num: nums){
            sum+=num;
            if(frequencies.containsKey(sum-k)){
                count+= frequencies.get(sum-k);
            }
            frequencies.put(sum, frequencies.getOrDefault(sum, 0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[]nums = {1,1,1};
        int k = 2;
        int solution = subarraySum(nums, k);
        System.out.println(solution);
    }
}
