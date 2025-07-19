public class secondSmallest {
    public static int secondSmallestFinder(int[] nums, int n){
        if(n<2)return -1;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i = 0; i<=n-1; i++){
            if(nums[i]<smallest){
                secondSmallest = smallest;
                smallest = nums[i];
            } else if (nums[i]<secondSmallest && nums[i]!=smallest) {
                secondSmallest = nums[i];
            }
        }
        return secondSmallest;
    }

    public static void main(String[] args) {
        int[]nums = {12,24,53,2,86,97,3};
        int n = nums.length;
        int sS = secondSmallestFinder(nums, n);
        System.out.println("The second smallest number is " + sS);
    }
}
