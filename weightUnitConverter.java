import java.util.Scanner;
public class weightUnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.println("""
                --------------------------------------------
                This is a weight unit converter...
                
                Press 1 to convert your weight in kgs to lbs
                Press 2 to convert your weight in lbs to kgs
                --------------------------------------------
                """);
        System.out.print("Enter a choice: ");
        input = scanner.nextInt();
        double weight;

        if(input==1){
            System.out.print("Enter your weight in kgs: ");
            weight = scanner.nextDouble();
            double weightLbs = 2.20462 * weight;
            System.out.printf("Your Weight in Pounds(lbs) is: %.2f lbs\n", weightLbs);
        }
        else if (input == 2) {
            System.out.print("Enter your weight in lbs: ");
            weight = scanner.nextDouble();
            double weightKgs = 0.453592 * weight;
            System.out.printf("Your Weight in Kilograms(kgs) is: %.2f Kg\n", weightKgs);
        }
        else{
            System.out.println("Enter a valid input please....");
        }
    }
}
