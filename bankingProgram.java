import java.util.Scanner;

public class bankingProgram {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        Boolean isRunning = true;
        double balance= 0 ;

        while(isRunning){
            System.out.println("""
                    *****************************
                    WELCOME TO THE BANKING SYSTEM
                    *****************************
                    1) Check Balance
                    2) Withdraw
                    3) Deposit
                    4) Quit
                    *****************************
                    """);

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch(choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = makeWithdraw(balance);
                case 3 -> balance = makeDeposit(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice!!! Try Again");

            }

        }
        System.out.println("THANK YOU FOR BANKING WITH US!");
        scanner.close();

    }
    static void showBalance(double balance) {
        System.out.printf("Your current balance is ₹%.2f\n", balance);
    }
    static double makeDeposit(double balance){
        System.out.print("Enter the amount for the deposit: ");
        double amount = scanner.nextDouble();
        if(amount<=0){
            System.out.println("Enter a valid amount...");
            return balance;
        }else {
            balance += amount;
            System.out.printf("Your updated balance is ₹%.2f\n", balance);

            return balance;
        }
    }

    static double makeWithdraw(double balance){
        System.out.print("Enter the amount you wish to withdraw: ₹");
        double amount = scanner.nextDouble();
        if(amount>balance){
            System.out.println("Insufficient funds!!!");
            System.out.println("Try again");
            return balance;
        }
        else if(amount<=0){
            System.out.println("Enter a valid amount...");
            return balance;
        }
        else{
            balance-=amount;
            System.out.printf("Your updated balance is ₹%.2f\n", balance);
            return balance;}
    }
}
