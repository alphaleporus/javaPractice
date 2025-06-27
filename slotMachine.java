import java.util.Random;
import java.util.Scanner;

public class slotMachine {
    public static void main(String[] args) {

//Declaration and instantiation
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] symbols = {"⭐","🎀","🔔","💍","🎁"};
        int balance = 100;
        int bet;
        String[] finalRoll = new String[3];

//Initial entry message
        System.out.println("*****************");
        System.out.println("SLOT MACHINE GAME");
        System.out.println("*****************");
        System.out.println("Symbols-> ⭐️,🎀,🔔,💍,🎁");
        System.out.println();
        while(balance>0) {
            System.out.println("Current balance = ₹" + balance);
            System.out.print("Place a bet: ");
            bet = scanner.nextInt();
            System.out.println();

            //Conditional statements
            if (bet > balance ) {
                System.out.println("INSUFFICIENT FUNDS");
            } else if (bet<=0) {
                System.out.println("Place a valid bet");
                continue;
            } else{
                balance-=bet;
            }
            //Rolling slot machine
            for (int i = 0; i < 3; i++) {
                int choice = random.nextInt(0, 5);
                String symbol = symbols[choice];
                finalRoll[i] = symbol;
            }
            System.out.print("|");
            for (String roll : finalRoll) {
                System.out.print(roll + "| ");
            }
            System.out.println();
            System.out.println();
            //Setting win conditions
           if (finalRoll[0].equals(finalRoll[1]) && finalRoll[0].equals(finalRoll[2])) {
               System.out.println("YOU WON 100x YOUR BET");
               System.out.println("WINNINGS VALUE: ₹" + bet * 100);
               balance += bet * 100;
           } else if (finalRoll[0].equals(finalRoll[1]) || finalRoll[0].equals(finalRoll[2]) || finalRoll[1].equals(finalRoll[2])) {
               System.out.println("YOU WON 5x YOUR BET");
               System.out.println("WINNINGS VALUE: ₹" + bet * 5);
               balance += bet * 5;
           }
        }
        System.out.println();
        System.out.println("Balance Over!");

    }
}
