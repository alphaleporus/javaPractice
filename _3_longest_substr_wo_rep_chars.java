import java.util.HashMap;

public class _3_longest_substr_wo_rep_chars {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> dict = new HashMap<>();
        int left = 0;
        int right = 0;
        int subStr =0;
        int maxSubStr = 0;
        while(right < s.length()){
            dict.put(s.charAt(right), dict.getOrDefault(s.charAt(right),0)+1);
            while(dict.get(s.charAt(right))>1){
                dict.put(s.charAt(left), dict.getOrDefault(s.charAt(left), 0)-1);
                left++;
            }
            subStr = (right - left)+1;
            maxSubStr = Math.max(maxSubStr, subStr);
            right++;
        }
        return maxSubStr;
    }
}
