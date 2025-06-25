import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNum = random.nextInt(1, 101);
        int guess;
        int tries = 5;
        System.out.println("Guess a number between 1 and 100(You have 5 total tries)...");

        do{
            guess = scanner.nextInt();
            tries--;
            if(guess == randomNum){
                System.out.println("Correct guess!");
                break;
            }
            if(guess < randomNum){
                System.out.println("Guess a bit higher... You have " + tries + " tries left...");
            }
            if(guess>randomNum){
                System.out.println("Guess a bit lower... You have " + tries + " tries left...");
            }
            if(guess<1 || guess>100){
                System.out.println("Enter a number between 0 and 100");
            }
        }while(tries> 0);
        if(tries == 0) {
            System.out.println("\n\nGameOver!!!");
            System.out.println("The correct Guess would have been " + randomNum);
        }
    }
}