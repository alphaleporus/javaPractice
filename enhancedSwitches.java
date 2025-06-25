import java.util.Locale;
import java.util.Scanner;

public class enhancedSwitches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day;
        System.out.print("Enter the day: ");
        day = scanner.nextLine().toLowerCase();

        switch(day) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.println("Today is weekday... 😣");
            case "saturday", "sunday" -> System.out.println("Today is weekend😃");
            default -> System.out.println(day + " is not a day🤥");
        }

        scanner.close();
    }
}
