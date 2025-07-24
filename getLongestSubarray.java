public class getLongestSubarray {
    public static int longestSubarray(int[]nums, long K){
        int n = nums.length;
        int maxLen = 0;
        for(int i =0; i<n;i++){
            for(int j = i; j<n; j++){
                long sum = 0;
                for(int k=i; k<=j;k++) {
                    sum += nums[k];
                }
                if(sum==K){
                    maxLen = Math.max(maxLen, j-i+1);
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] a = {1,1,3,2, 3, 5, 1, 9, 1};
        long K = 10;
        int len = longestSubarray(a, K);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
