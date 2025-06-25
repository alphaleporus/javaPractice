import java.util.Scanner;
public class emailSlicer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String email;
        String domain;
        String username;

        System.out.print("Enter your Email ID: ");
        email = scanner.nextLine();

        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);
            System.out.println("Username: "+ username);
            System.out.println("Domain: "+ domain);
        }
        else{
            System.out.println("Email is not valid... it should contain '@'");
        }
    }
}
