import java.util.Scanner;

public class leetcode9palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        int x=scanner.nextInt();
        int y=0;
        int z;
        int a = x;
        while(x>0) {
            z = x % 10;
            y = y * 10 + z;
            x = x / 10;
        }
        System.out.println(y);
        if(y==a){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
