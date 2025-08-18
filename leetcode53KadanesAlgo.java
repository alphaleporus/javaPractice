public class leetcode53KadanesAlgo {
    public static int MaxSubArray(int[]nums){
        int n = nums.length;

        if(n==0){
            return 0;
        }

        int currentSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1 ; i<=n-1; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[]nums = {1};
        int solution = MaxSubArray(nums);
        System.out.println(solution);
    }
}
