public class leetcode485 {
    public static void maxConsecutive(int[] nums){
        int i =0;
        if(i== nums.length) return;
        int[] sum = new int[nums.length];
        int j =0;
        while(i < nums.length ){
        if(nums[i]==1){
            sum[j]+=1;
            i++;
        } else if (nums[i] == 0) {
            j++;
            i++;
        }
        }
        System.out.println(sorter(sum));
    }
    public static int sorter(int[] sum){
        int max = 0;
        for(int num : sum){
            if(max < num){
                max = num;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[]nums = {1,1,0,1,1,1};
        maxConsecutive(nums);
    }
}
