import java.util.HashMap;

public class TwoSumHashing {
    public static int[] twoSum(int[]a, int target){
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i = 0; i< a.length; i++){
            int x = target - a[i];
            if(map.containsKey(x)){
                return new int[]{i,map.get(x)};
            }
            map.put(a[i],i);
        }
        return new int[]{};
    }
    public static void main(String args[]) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        int[] ans = twoSum(arr, target);
        System.out.println("This is the answer for hashed variant: [" + ans[0] + ", "
                + ans[1] + "]");
        }
}
