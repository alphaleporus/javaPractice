import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String unit;
        double temp;
        double newTemp;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to celsius or fahrenheit(C or F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 5/9) +32;
        System.out.printf("The temperature is %.2f°%s.", newTemp, unit);

        scanner.close();
    }
}
