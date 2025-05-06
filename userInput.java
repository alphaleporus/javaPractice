//Importing Scanner Class:
import java.util.Scanner;

public class userInput{
    public static void main(String[] args){
//        calling scanner method
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your Gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a boy?(true/false) ");
        boolean isBoy = scanner.nextBoolean();

        System.out.println("Hello " + name + ".");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your gpa is " + gpa);

        if(isBoy){
            System.out.println("You are a boy.");
        }
        else{
            System.out.println("You are a girl.");
        }

        scanner.close();
    }
}