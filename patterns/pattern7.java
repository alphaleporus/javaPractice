package patterns;

public class pattern7 {
    public static void main(String[] args) {
        System.out.println("Pattern 8: ");
        for(int i = 5; i > 0;i--){
            for(int j = i-1; j>=0; j--){
                System.out.print(" ");
            }
            for(int k = i; k<=5;k++){
                System.out.print("*");
            }
            for(int l = i; l<5;l++)
                System.out.print("*");
            System.out.println();
        }
    }
}
