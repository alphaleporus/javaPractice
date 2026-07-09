import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;


public class _49_group_anagram {
    public List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if(map.containsKey(key)){
                map.get(key).add(s);
            }
            else{
                map.put(key, new ArrayList<>(Arrays.asList(s)));
            }
        }
        return new ArrayList<>(map.values());
        
    }
    public static void main(String[] args) {
        String [] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        _49_group_anagram obj = new _49_group_anagram();
        List<List<String>> result = obj.groupAnagrams(strs);
        System.out.println(result);
    }
}
