import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _347_top_k_freq_el {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }
        int[] result = new int[k];
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freqMap.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());
        for(int i=0; i<k; i++){
            result[i] = list.get(i).getKey();
        }
        return result;
    }
}
