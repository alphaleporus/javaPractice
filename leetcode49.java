import java.util.*;

public class leetcode49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String temp = Arrays.toString(charArray);

            map.putIfAbsent(temp, new ArrayList<>());
            map.get(temp).add(s);
        }
        result.addAll(map.values());
        return result;
        }


    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = groupAnagrams(strs);
        System.out.println(result);
    }
}
