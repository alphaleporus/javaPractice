import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        int trials = 0;
        int rand;

        rand = random.nextInt(0,101);

        while(guess != rand && trials <5){
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            if(guess > rand){
                System.out.println("Guess a bit lower...");
            }
            else if(guess < rand){
                System.out.println("Guess a bit higher...");
            }
            trials++;
        }

        if(guess == rand){
            System.out.println("Correct answer!!!");
        }
        else {
            System.out.println(
                    "No lives remaining...."
            );
        }
    }
}
