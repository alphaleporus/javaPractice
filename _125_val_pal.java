public class _125_val_pal {
    public boolean isPalindrome(String s) {
        String CleanedS = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        for(int i = CleanedS.length()/2; i<CleanedS.length(); i++){
            if(CleanedS.charAt(i)!=CleanedS.charAt(CleanedS.length()-1-i)){
            return false;
            }
        }
        return true;
    }
}
