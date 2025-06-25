import java.util.Scanner;

public class matrixPrinter {
    public static void main(String[] args) {
        int rows;
        int columns;
        String chars;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows you want: ");
        rows = scanner.nextInt();
        System.out.print("Enter the number of columns you want: ");
        columns = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter a character: ");
        chars = scanner.nextLine();
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns ; j++){
                System.out.print(chars);
            }
            System.out.println();
        }
    }
}
