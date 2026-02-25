import java.util.Scanner;
public class palindrome {
    public static int revInt(int n){
        int reversed = 0;
        while(n>0) {
            int last = n % 10;
            reversed = 10 * reversed + last;
            n = n/10;
        }
        return reversed;
    }
    public static boolean isPalindrome(int x) {
        return x == revInt(x);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();
        if (isPalindrome(x))
            System.out.println("The number is a palindrome.");
        else
            System.out.println("The number is not a palindrome.");
        scanner.close();
    }
}
