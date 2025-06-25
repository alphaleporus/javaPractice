import java.util.Scanner;
public class compoundInterestCalculator {
    public static void main(String[] args){
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest(in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of times compounded per year(usually 1): ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1+rate/timesCompounded, timesCompounded*years);
        double returns = amount - principal;

        System.out.printf("The total amount with the compounded returns is ₹%.2f.\n", amount);
        System.out.printf("The total returns you earned on ₹%.2f are ₹%.2f.", principal, returns);
    }
}
