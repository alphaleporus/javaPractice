import java.util.Arrays;

public class leetcode2149 {
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int pos = 0;
        int neg = 1;
        int[] reNums = new int[n];
        for(int num: nums){
            if(num>0){
                reNums[pos]=num;
                pos+=2;
            }
            else {
                reNums[neg]=num;
                neg+=2;
            }
        }
        return reNums;
    }

    public static void main(String[] args) {
        int[]nums = {3,1,-2,-5,2,-4};
        int[] solution = rearrangeArray(nums);
        System.out.println(Arrays.toString(solution));
    }
}
