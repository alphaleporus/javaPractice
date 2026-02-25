import java.util.HashMap;

class leetcode217 {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> visitedCount = new HashMap<>();
        int length = nums.length;
        for (int num : nums) {
            visitedCount.put(num, visitedCount.getOrDefault(num, 0) + 1);
            if (visitedCount.get(num) > 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[]nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}
