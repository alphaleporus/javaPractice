import java.util.Scanner;

public class checkForPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scanner.nextInt();
        boolean isPrime = true;
        if(input<=1){
            isPrime = false;
        }else{
            for(int i =2; i<=Math.sqrt(input);i++){
                if(input%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(input + " IS prime.");
        }
        else{
            System.out.println(input + " IS NOT prime.");
        }
    }
}
