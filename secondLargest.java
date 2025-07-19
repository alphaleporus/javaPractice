public class secondLargest {
    public static int secondLargestFinder(int[] nums, int n) {
        if(n< 2)return -1;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i <= n-1 ; i++){
            if(nums[i] > largest){
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] > secondLargest && nums[i] != largest) {
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[]nums = {12,24,53,2,86,97,3};
        int n = nums.length;
        int sL = secondLargestFinder(nums, n);
        System.out.println("The second Largest number is " + sL);
    }

}
