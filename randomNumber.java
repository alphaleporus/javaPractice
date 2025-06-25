import java.util.Random;
public class randomNumber {
    public static void main (String[] args){

        Random random = new Random();

//        Random integers
        int integer;
        integer = random.nextInt();
        System.out.println(integer);

//        Random integers between a specific range (1-100)
        int range;
        range = random.nextInt(1,101);
        System.out.println(range);

//        Double numbers(numbers in decimal points)
        double number;
        number = random.nextDouble();
        System.out.println(number);

//        Random Boolean(coin flip)
        boolean isHeads;
        isHeads = random.nextBoolean();

        if(isHeads){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }
    }
}
