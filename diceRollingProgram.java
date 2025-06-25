import java.util.Random;
import java.util.Scanner;

public class diceRollingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberOfDice;
        int totalOfRoll=0;
        System.out.print("How many dice you wanna roll? -> ");
        numberOfDice = scanner.nextInt();
        if(numberOfDice<=0){
            System.out.println("Enter a valid positive request...");
        }
        System.out.printf("Rolling %d dice...\n", numberOfDice);
        for(int i=1; i<=numberOfDice; i++){
            int roll = random.nextInt(1,7);
            System.out.println("You rolled " + roll);
            printDie(roll);
            totalOfRoll += roll;
        }
        System.out.println("Total of all rolls: " + totalOfRoll);
    }
    static void printDie(int roll){
        String dice1 = """
                +-------+
                |       |
                |   o   |
                |       |
                +-------+""";
        String dice2 = """
                +-------+
                | o     |
                |       |
                |     o |
                +-------+""";
        String dice3 = """
                +-------+
                | o     |
                |   o   |
                |     o |
                +-------+""";
        String dice4 = """
                +-------+
                | o   o |
                |       |
                | o   o |
                +-------+""";
        String dice5 = """
                +-------+
                | o   o |
                |   o   |
                | o   o |
                +-------+""";
        String dice6 = """
                +-------+
                | o   o |
                | o   o |
                | o   o |
                +-------+""";

        switch(roll){
            case 1-> System.out.println(dice1);
            case 2-> System.out.println(dice2);
            case 3-> System.out.println(dice3);
            case 4-> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
        }

    }
}
