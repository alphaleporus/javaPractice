import java.util.Scanner;

public class ifAdult {
    public static void main(String[] args){
        int age;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your age? ");
        age =  scanner.nextInt();

        if(age >= 18) {
            System.out.println("You are an adult!!!");
        }
        else if(age < 0){
            System.out.println("You haven't even born yet :]");
        }
        else{
            System.out.println("You are a minor...");
            }

        scanner.close();
        }
    }

