import java.util.Scanner;
public class fitnessChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                --------------------------------------------------
                This is a Fitness checker using BMI..
                Answer the following questions to get your status!
                --------------------------------------------------
                """);
        double weight;
        double heightcm;
        System.out.print("Enter your weight(in kgs): ");
        weight = scanner.nextDouble();
        System.out.print("Enter your height(in cms): ");
        heightcm = scanner.nextDouble();
        double height = heightcm/100;

        double bmi = bmiCheck(weight, height);
        double lowWeight= optimalLowWeight(height);
        double highWeight = optimalHighWeight(height);

        if (bmi<18.5){
            System.out.println("\nYou are UNDERWEIGHT and have a bmi index of "+ bmi);
            System.out.printf("Your optimal weight should be between %.1fKgs and %.1fKgs.", lowWeight, highWeight);
        }
        else if (bmi >=18.5 && bmi <=22.9){
            System.out.println("\nYou are HEALTHY and have a bmi index of "+ bmiCheck(weight, height));
            System.out.printf("Your optimal weight should be between %.1fKgs and %.1fKgs.", lowWeight, highWeight);
        }
        else if (bmi>=23 && bmi<=24.9){
            System.out.println("\nYou are OVERWEIGHT(at risk of obesity) and have a bmi index of "+ bmiCheck(weight, height));
            System.out.printf("Your optimal weight should be between %.1fKgs and %.1fKgs.", lowWeight, highWeight);
        }
        else if (bmi>=25 && bmi<=29.9){
            System.out.println("\nYou are OBESE CLASS 1 and have a bmi index of "+ bmiCheck(weight, height));
            System.out.printf("Your optimal weight should be between %.1fKgs and %.1fKgs.", lowWeight, highWeight);
        }
        else if (bmi>=30){
            System.out.println("You are OBESE CLASS 2(severe!!!) and have a bmi index of "+ bmiCheck(weight, height));
            System.out.printf("Your optimal weight should be between %.1fKgs and %.1fKgs.", lowWeight, highWeight);
        }

    }
    static double bmiCheck(double weight, double height){
        return (weight/(height*height));
    }
    static double optimalLowWeight(double height){
        return 18.5 * (height*height);
    }
    static double optimalHighWeight(double height){
        return 22.9 * (height * height);
    }
}
