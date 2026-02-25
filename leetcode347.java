import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class leetcode347 {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for(int n:nums){
            frequencyMap.put(n, frequencyMap.getOrDefault(n,0)+1);
        }

        Arrays.sort(frequencyMap.values().toArray());
        for(int i = 0; i < k; i++){
        }
    }
}
