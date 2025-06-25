import java.util.Scanner;

public class varargsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you wanna add? ");
        int count = scanner.nextInt();
        double[] nums = new double[count];

        for(int i=0; i< count; i++){
            System.out.print("Enter number " + (i+1) +  ": ");
            double num = scanner.nextDouble();
            nums[i] = num;
        }

        System.out.println("The sum of all numbers is "+ add(nums));
    }
    static double add(double... numbers){
        double sum = 0;
        for(double number : numbers){
            sum += number;
        }
        return sum;
    }
}
