import java.util.Scanner;
import java.util.Random;

public class rockPaperScissor {
    public static void main(String[] args) {
        int playCount= 0;
        int winCount= 0;
        boolean notValid = false;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] options = {"Rock", "Paper", "Scissor"};

        System.out.println("WELCOME TO ROCK, PAPER, SCISSOR....");
        System.out.println("|Press 'q' to quit|");
        while(true){

            int choice = random.nextInt(0,3);
            String compChoice = options[choice].toLowerCase();

            System.out.println();
            System.out.print("Enter your choice: ");
            String input = scanner.nextLine();


            if(input.equalsIgnoreCase("q")){
                System.out.println("Your final score is " + winCount + "/" + playCount);
                System.out.println("Thanks for playing!!!");
                break;
            }
            else if(!input.equalsIgnoreCase("rock") && !input.equalsIgnoreCase("paper") && !input.equalsIgnoreCase("scissor")){
                System.out.println("Enter a valid choice!");
                notValid=true;
                continue;
            }
            if(!notValid){
                playCount++;}
            if(compChoice.equalsIgnoreCase("rock")&&input.equalsIgnoreCase("paper")||
                    compChoice.equalsIgnoreCase("paper")&&input.equalsIgnoreCase("scissor")||
                    compChoice.equalsIgnoreCase("scissor")&&input.equalsIgnoreCase("rock")){
                System.out.println("YOU WON!!!");
                System.out.println("Computer chose: "+ compChoice.toUpperCase());
                winCount++;
            }else if(compChoice.equalsIgnoreCase(input)){
                System.out.println("TIE....");
            }
            else{
                System.out.println("YOU LOSE!!!");
                System.out.println("Computer chose: "+ compChoice.toUpperCase());
            }
        }
    }


}
