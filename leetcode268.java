import java.util.ArrayList;

public class leetcode268 {

    public static void main(String[] args) {

        int[] nums = {0,1,3};
        int n = nums.length;
        ArrayList<Integer> fullList = new ArrayList<>();
        for(int i = 0; i<=n; i++){
            fullList.add(i);
        }
        for(int num:nums){
            fullList.remove(Integer.valueOf(num));
        }
        System.out.println(fullList.get(0));
    }
}
