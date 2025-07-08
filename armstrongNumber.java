import java.util.Scanner;
public class armstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check for armstrong number: ");
        int N = scanner.nextInt();
        scanner.nextLine();
        int temp = N;
        int digit = 0;
        int y;
        int z =0;
        while(temp != 0){
            temp = temp / 10;
            digit = digit +1;
        }
        temp = N;
        while(temp != 0){
            y = temp %10;
            z = (int) (z + Math.pow(y , digit));
            temp= temp/10;
        }
        if(z==N){
            System.out.println(N + " is an Armstrong number.");
        }else{
            System.out.println(N + " is NOT an Armstrong number.");
        }
        scanner.close();
    }
}
