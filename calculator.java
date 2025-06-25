import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        String operator;

        System.out.print("Enter the first number: ");
        a = scanner.nextDouble();

        System.out.print("Enter the operation(*, /, +, -, ^): ");
        operator = scanner.next();

        System.out.print("Enter the first number: ");
        b = scanner.nextDouble();

        switch(operator){
            case "*" -> System.out.println("Result is " + (a * b));
            case "+" -> System.out.println("Result is " + (a + b));
            case "-" -> System.out.println("Result is " + (a - b));
            case "/" -> System.out.println("Result is " + (a / b));
            case "^" -> System.out.println("Result is " + (Math.pow(a,b)));
        }

        scanner.close();

    }
}
