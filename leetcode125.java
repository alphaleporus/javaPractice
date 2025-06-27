import java.util.Scanner;

public class leetcode125 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();
        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println(input.equalsIgnoreCase(reversed));
    }
}
