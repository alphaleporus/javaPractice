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

        System.out.println("Enter a number to count using brute force approach: ");
        int i = scanner.nextInt();
        int counter = 0;
        int in = i;
        while(i>0){
            counter++;
            i = i/ 10;
        }
        System.out.println(in + " has " + counter + " digits... ");
    }
}
