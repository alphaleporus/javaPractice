import java.util.Scanner;

public class inputInArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many devices do you have? ");
        int numberOfDevices = scanner.nextInt();
        scanner.nextLine();

        String[] devices = new String[numberOfDevices];

        for(int i = 0; i< devices.length; i++){
            System.out.print("Enter the device to list: ");
            devices[i] = scanner.nextLine();
        }

        for(String device : devices){
            System.out.print(device + ", ");
        }
    }

}
