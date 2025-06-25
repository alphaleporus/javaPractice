import java.util.Scanner;
public class oddEvenTernaryOperator {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check for odd or even: ");
        number = scanner.nextInt();

//        This is the ternary operator....
//        variable = (condition) ? ifTrue : ifFalse;
        String isEvenOrOdd = (number % 2 ==0) ? "Even" : "Odd";

        System.out.println("The number is " + isEvenOrOdd);
    scanner.close();
    }
}
