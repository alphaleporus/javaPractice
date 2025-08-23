import java.util.ArrayList;

public class printLeaders {
    public static void FindLeaders(int[]nums, ArrayList<Integer>leaders){
        int max = Integer.MIN_VALUE;
        for(int i = nums.length-1; i>=0; i--){
            max = Math.max(nums[i], max);
            if(nums[i]==max){
                leaders.add(nums[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[]nums = {10, 22, 12, 3, 0, 6};
        ArrayList<Integer> leaders = new ArrayList<>();
        FindLeaders(nums, leaders);
        System.out.println(leaders);
    }
}
