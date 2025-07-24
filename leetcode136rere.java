public class leetcode136rere {
    public static int singleNumber(int[] nums) {
        int current = 0;
        for(int num: nums){
            current = current ^ num;
        }
        return current;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1};
        System.out.println(singleNumber(nums));
    }
}
