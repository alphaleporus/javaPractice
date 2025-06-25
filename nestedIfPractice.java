import java.util.Scanner;
public class nestedIfPractice {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        boolean isStudent;
        boolean isSenior;
        int price = 999;
        double finalPrice;

        System.out.print("""
                --------------------------------------
                This is a ticket buying platform....
                
                Regular price: ₹999
                Student discount: 10%
                Senior discount: 20%
                --------------------------------------\n""");

        System.out.print("Are you a student?(true/ false): ");
        isStudent = scanner.nextBoolean();

        System.out.print("Are you a senior?(true/ false): ");
        isSenior = scanner.nextBoolean();

        if(isStudent) {
            if (isSenior) {
                System.out.println("You availed 10% student discount in addition to 20% senior discount...");
                finalPrice = price * 0.7;
                System.out.println("Final amount to be paid: " + finalPrice);
            } else {
                finalPrice = price * 0.9;
                System.out.println("You availed 10% student discount");
                System.out.println("Final amount to be paid: " + finalPrice);
            }
            }
        else if(isSenior){
            finalPrice = price * 0.8;
            System.out.println("You availed 20% senior discount...");
            System.out.println("Final amount to be paid: " + finalPrice);
            }
        else{
            finalPrice = price;
            System.out.println("Final amount to be paid: " + finalPrice);
        }
        }
    }

