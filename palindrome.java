import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name to check for Palindrome: ");
        String name = scanner.nextLine();
        String original = name;
        String reversed = "";
        boolean isPalindrome = false;
        for(int i = name.length()-1; i >=0 ; i--){
            reversed += name.charAt(i);
        }
        if(original.equalsIgnoreCase(reversed)){
            isPalindrome = true;
        }
        System.out.println("original: "+ original);
        System.out.println("reversed: "+ reversed);
        System.out.println(isPalindrome);
    }
}
