import java.util.HashMap;

public class leetcode169 {
    public static int Counter(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> numsCount = new HashMap<>();
        for (int num : nums) {
            numsCount.put(num, numsCount.getOrDefault(num, 0) + 1);
        }
        int solution = 0;
        for (int key : numsCount.keySet()) {
            if(numsCount.get(key)>n/2){
                solution=key;
            }
        }
        return solution;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int sol = Counter(nums);
        System.out.println(sol );
    }
}
