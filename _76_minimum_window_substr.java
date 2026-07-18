import java.util.Arrays;
import java.util.HashMap;

public class _76_minimum_window_substr {
    public String minWindow(String s, String t) {
        int[] tFreqMap = new int[128];
        int[] sFreqMap = new int[128];
        for(int i =0; i<t.length() ; i++){
            tFreqMap[t.charAt(i)]++;
            sFreqMap[s.charAt(i)]++;
        }
        String solution="";
        int left = 0;
        int right = t.length()-1;
        while(right<s.length()){
            if(Arrays.equals(tFreqMap, sFreqMap)&&solution.length() > s.substring(left, right+1).length()){
                solution = s.substring(left, right+1);
                sFreqMap[s.charAt(left)]--;
                left++;
                continue;
            }
            else if(right<s.length()-1){
                right++;
                sFreqMap[s.charAt(right)]++;
            }else break;
        }
        return solution;
    }
}
