import java.util.HashMap;

public class leetcode242 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer>sCount = new HashMap<>();
        HashMap<Character, Integer>tCount = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            sCount.put(s.charAt(i),sCount.getOrDefault(s.charAt(i), 0) + 1);
            tCount.put(t.charAt(i), tCount.getOrDefault(t.charAt(i), 0)+1);
        }

        for(int i = 0; i < s.length(); i++){
            char key = s.charAt(i);
            if(!sCount.get(key).equals(tCount.get(key))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        leetcode242 Solution = new leetcode242();
        System.out.println(Solution.isAnagram(s, t));
    }
}
