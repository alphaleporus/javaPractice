import java.util.Scanner;
import java.util.ArrayList;

public class allDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prints all divisors...");
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        ArrayList<Integer> divisors = new ArrayList<>();
        for(int i = 1 ; i <= input; i++){
            if(input%i==0){
                divisors.add(i);
            }
        }
        System.out.print("The divisors of "+ input +" are " );
        for(int i = 0; i < divisors.size()-1; i++){
            System.out.print(divisors.get(i) + ", ");
        }
        System.out.print(divisors.getLast() + ".");
        scanner.close();
    }
}
