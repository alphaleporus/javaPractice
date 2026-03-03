import java.util.Arrays;

public class leetcode167 {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i< numbers.length-1;i++){
            for(int j = i+1; j< numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    return new int[]{i+1, j+1};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[]numbers = {2,7,11,15};
        int target = 9;
        leetcode167 leetcode167 = new leetcode167();
        int[] result = leetcode167.twoSum(numbers, target);
        System.out.println(Arrays.toString(result));
    }
}
