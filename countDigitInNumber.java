import java.util.Scanner;

public class countDigitInNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGIT COUNTING PROGRAM");
        System.out.println();
        System.out.println("Enter a number: ");
        Integer number = scanner.nextInt();
        String num = number.toString();
        int digit = num.length();
        System.out.println(number + " has " + digit + " digits... ");
    }
}
