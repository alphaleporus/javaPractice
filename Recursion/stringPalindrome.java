package Recursion;

public class stringPalindrome {
    static boolean isPalindrome(String s, int p1 ,int p2){
        s=s.toLowerCase();
        if (p1>=p2)return true;
        if(s.charAt(p1) != s.charAt(p2)) return false;
        return isPalindrome(s,p1+1 , p2-1);
    }

    public static void main(String[] args) {
        String s = "Madam";
        if(isPalindrome(s ,0, s.length()-1)){
            System.out.println(s + " IS a Palindrome");
        }
        else{
            System.out.println(s + " IS NOT a palindrome");
        }
    }
}


