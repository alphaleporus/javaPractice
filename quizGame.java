import java.util.Scanner;

public class quizGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isValid = true;

        System.out.println("|****************************************|");
        System.out.println("|  Welcome To Quiz Game Powered By Java  |");
        System.out.println("|****************************************|");

        String[] questions = {"1. What is the name of my dog with a limp?",
                "2. What is Gaurav Sharma most likely to do when he gets rejected by 6 top universities due to finances?",
                "3. After recovering from dengue and nearly dying, what did Gaurav *actually* do?",
                "4. Gaurav’s idea of a romantic gesture includes:",
                "5. What does Gaurav use his allowance for?",
                "6. Gaurav’s friend circle broke apart because:"};
        String[][] options = {
                {"A. Julie", "B. Rani", "C. Bhuru", "D. Kaani"},
                {
                        "A. Cry into a tub of paneer",
                        "B. Start algorithmic trading bots to conquer capitalism",
                        "C. Email Elon Musk with the subject line: \"Bro, invest in me\"",
                        "D. Start a humble NGO called ‘Gaurav Deserves Better Foundation’"
                },
                {
                        "A. Wrote a sad poem and became a shayar",
                        "B. Trained for a 10K marathon because why not challenge death twice?",
                        "C. Bought immunity boosters and sold them on Shark Tank India",
                        "D. Tattooed \"Vitamin B12 is BAE\" on his chest"
                },
                {
                        "A. Taking her to Domino’s and ordering the cheapest pizza",
                        "B. Giving her a diary he actually *read*, and then added a page to (legend behaviour)",
                        "C. Saying “I love you” in binary",
                        "D. Hiding her name in every conversation like a secret K-drama plot twist"
                },
                {
                        "A. Feeding stray cats because they \"look like investors\"",
                        "B. Investing ₹500–₹1,000 in crypto and penny stocks like a teenage Warren Buffet",
                        "C. Buying sketchbooks to draw friends who won’t talk to him",
                        "D. Hiring a body double to attend classes while he swing-trades"
                },
                {
                        "A. He forgot everyone’s birthdays and only remembered Navya’s",
                        "B. He became too hot to handle after gaining muscle post-dengue",
                        "C. Anya went full Voldemort and divided the group like Horcruxes",
                        "D. They found out he talks to AI more than to them"
                }
        };

       String[] answers = {"A", "B", "B", "B", "B","C"};
       int correctCount = 0;

       for(int i = 0; i<questions.length;i++){
           System.out.print("\n"+questions[i]+"\n");
           for(String option : options[i]){
               System.out.println(option);
           }
           System.out.print("Enter your guess[A/B/C/D]: ");
           String guess = scanner.nextLine();

           if(guess.equalsIgnoreCase(answers[i])){
               System.out.println("Correct!!!");
               correctCount++;
           }else{
               System.out.println("Incorrect... Try Again!!!");
           }
       }
        System.out.println("\n \n Your total score was " + correctCount + " out of 6.");
       scanner.close();
    }
}
