public class leetcod125 {
    public static boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        for(int i =0; i<cleaned.length()/2;i++){
            if(cleaned.charAt(i) != cleaned.charAt(cleaned.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String sample = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(sample));
    }
}
