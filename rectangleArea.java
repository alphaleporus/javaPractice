import java.util.Scanner;
public class rectangleArea {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double length = 0;
        double breadth = 0;
        double area = 0;
        String unit = "Meter per square" ;
        System.out.print("Enter the length: ");
        length = scanner.nextDouble();

        System.out.print("Enter the breadth: ");
        breadth = scanner.nextDouble();

        area = breadth * length;

        System.out.println("The area of the rectangle is " + area + unit);

        scanner.close();

    }
}
