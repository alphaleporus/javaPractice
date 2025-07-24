public class leetcode268re {
    public static void main(String[] args) {
        int[] nums = {0,1,3};
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i<=n; i++){
            sum+=i;
        }
        int numSum =0;
        for(int num:nums){
            numSum += num;
        }
        System.out.println(sum - numSum);

    }
}
