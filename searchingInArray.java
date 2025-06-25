import java.util.Scanner;

public class searchingInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fruits = {"Apple", "Banana", "Coconut", "Pineapple"};
        boolean isFound = false;
        System.out.print("Enter the fruit you wanna find: ");
        String fruit = scanner.nextLine();

        for(int i = 0; i<fruits.length; i++) {
            if (fruit.equalsIgnoreCase(fruits[i])) {
                System.out.println("'" + fruits[i] + "'" + " is found at index " + i + " in the array.");
                isFound = true;
                break;
            }
        }
        if(!isFound) {
            System.out.println("'" + fruit +"'" + " does not exist in the array.");
        }
        scanner.close();
    }
}
