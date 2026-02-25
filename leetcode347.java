import java.util.*;

public class leetcode347 {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for(int n:nums){
            frequencyMap.put(n, frequencyMap.getOrDefault(n,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> heap = new PriorityQueue<>((a, b) ->
                Integer.compare(a.getValue(), b.getValue()));
        for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
            int freq = entry.getValue();
            int key = entry.getKey();
            heap.add(entry);
            if(heap.size() > k){
                heap.poll();
            }
        }
        int[] result = new int[k];
        for(int i =0; i<k;i++){
            result[i] = heap.poll().getKey();
        }
        return result;
    }

    public static void main(String[] args) {
        leetcode347 obj = new leetcode347();
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] result = topKFrequent(nums ,k);
        for(int i =0; i<k;i++){
            System.out.print(result[i] + " ");
        }

    }
}
