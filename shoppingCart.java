import java.util.Scanner;

public class shoppingCart {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String item="";
        double price= 0 ;
        int quantity = 0;
        char currency = '₹';

        System.out.print("What do you wanna buy? ");
        item = scanner.nextLine();

        System.out.print("How many? ");
        quantity = scanner.nextInt();

        System.out.print("What is the price of " + item + " " );
        price = scanner.nextDouble();

        System.out.println("The total bill amount of your purchase is " + currency + price * quantity );

        scanner.close();
    }
}
