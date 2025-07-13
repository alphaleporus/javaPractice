public class leetcode1752 {
    public static void main(String[] args) {
        int[] nums = {4,5,1,2,3};
        int count = 0;
        int n = nums.length;
        for(int i=0; i<n ; i++){
            if(nums[i]>nums[(i+1)%n]){
                count++;
            }
        }
        if(count >1){
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
    }
}
