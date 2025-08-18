public class leetcode53 {
    public static int MaxSubArray(int[] nums){
        int n = nums.length;

        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n ; i++){
            int sum=0;
            for( int j = i; j<n; j++){
                sum+=nums[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[]nums = {-2,1,-3,4,-1,2,1,-5,4};
        int solution = MaxSubArray(nums);
        System.out.println(solution);
    }
}
