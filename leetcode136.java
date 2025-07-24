public class leetcode136 {
    public static int singleNumber(int[] nums) {
        int count = 0;
        for (int num : nums) {
            for (int i : nums) {
                if (i == num) {
                    count++;
                }
            }
            if (count == 1) {
                return num;
            }
            count = 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1};
        System.out.println(singleNumber(nums));
    }
}
