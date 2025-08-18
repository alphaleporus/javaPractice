import java.util.Arrays;

public class leetcode2149failed {
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int x = 0;
        int current = nums[x];
        int nextNum = 0;
        while(x<n){
            if(x%2==0){
                if(current>=0){
                    x++;
                    continue;
                }
                else{
                    for(int i = x ; i< n; i++){
                        if(nums[i]>=0){
                            int temp = nums[i];
                            nums[i] = current;
                            current = temp;
                        }
                    }
                    x++;
                }
            } else if (x%2!=0) {
                if(current<0){
                    x++;
                    continue;
                }
                else{
                    for(int i = x ; i< n; i++){
                        if(nums[i]<0){
                            int temp = nums[i];
                            nums[i] = current;
                            current = temp;
                        }
                    }
                    x++;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[]nums = {3,1,-2,-5,2,-4};
        int[] solution = rearrangeArray(nums);
        System.out.println(Arrays.toString(solution));
    }
}
