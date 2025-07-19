public class largestElement {
    public static int largestElement(int[] nums , int i){
        if(i==0)return nums[0];
        int largest = largestElement(nums, i-1);
        return Math.max(nums[i], largest);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,13,9,8,7};
        int i = nums.length -1;
        System.out.println(largestElement(nums, i));
    }
}
