public class leetcode14 {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longest(strs));

    }
    public static String longest(String[] strs){
        String prefix = strs[0];

        for (int i = 0; i < strs.length; i++) {
            if (strs.length == 0) {
                return "";
            }
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.length()==0){
                    return "";
                }
            }
        }
        return prefix;
    }
}
