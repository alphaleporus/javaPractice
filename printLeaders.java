import java.util.ArrayList;

public class printLeaders {
    public static void findLeaders(int[]nums, ArrayList<Integer>Leaders){
        int max = 0;
        for(int i = nums.length-1; i>=0; i--){
            max = Math.max(nums[i], max);
            if(nums[i]==max){
                Leaders.add(nums[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[]nums = {10, 22, 12, 3, 0, 6};
        ArrayList<Integer> Leaders = new ArrayList<>();
        findLeaders(nums, Leaders);
        System.out.println(Leaders);
    }
}
