//Delayed Pyramid
public class Practice{
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i<10; i++){
            for(int j = 10; j>i; j--){
                System.out.print(" ");
            }

            for(int k = 0; k<=2*i; k++){
                System.out.print("x");
                Thread.sleep(80);
            }
            System.out.println();

        }
    }
}



