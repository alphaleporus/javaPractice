public class leetcode169BoyerMooreVotingAlgorithm {
    public static int MajorityCounter(int[]nums){
        int candidate=0;
        int count=0;
        for(int num : nums){
            if(count==0){
                candidate=num;
                count++;
            } else if (candidate==num) {
                count++;
            } else  {
                count--;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {6,6,6,7,7};
        int solution = MajorityCounter(nums);
        System.out.println(solution);
    }
}
