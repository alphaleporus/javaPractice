import java.util.HashMap;

public class leetcode136re {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> frequencyOfNumber = new HashMap<>();
        for(int num : nums){
            frequencyOfNumber.put(num, frequencyOfNumber.getOrDefault(num, 0)+1);
        }
        for(int i : frequencyOfNumber.keySet()){
            if(frequencyOfNumber.get(i)==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1};
        System.out.println(singleNumber(nums));
    }
}
