public class leetcode1 {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(nums[i]+nums[j]==target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        leetcode1 l = new leetcode1();
        int[] result = l.twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
