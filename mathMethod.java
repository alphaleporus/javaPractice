import java.util.Scanner;

public class mathMethod {
    public static void main(String[] args){
//        HYPOTENUSE;
        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        a = scanner.nextDouble();
        System.out.print("Enter value of b: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

        System.out.println("The hypotenuse of the given sides would be: " + c + "cm");
        scanner.close();
    }
}
