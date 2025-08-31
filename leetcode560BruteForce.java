public class leetcode560BruteForce {
    public static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int solution=0;
        for(int i =0; i<=n-1; i++){
            sum=0;
            for(int j = i; j<=n-1;j++){
                sum+=nums[j];
                if(sum==k){
                    solution++;
                }
            }
        }
        return solution;
    }

    public static void main(String[] args) {
        int[]nums = {1,1,1};
        int k = 2;
        int solution = subarraySum(nums, k);
        System.out.println(solution);
    }
}
