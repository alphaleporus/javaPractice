package patterns;

public class pattern20 {
    public static void main(String[] args) {
        System.out.println("Pattern 20: ");
        for(int i = 0; i<=5; i++){
            for(int j = i; j>0; j--){
                System.out.print("*");
            }
            for(int k = i; k<5 ; k++){
                System.out.print(" ");
            }
            for(int k = i; k<5 ; k++){
                System.out.print(" ");
            }
            for(int j = i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i<5; i++){
            for(int k = i; k<5 ; k++){
                System.out.print("*");
            }
            for(int j = i; j>0; j--){
                System.out.print(" ");
            }
            for(int j = i; j>0; j--){
                System.out.print(" ");
            }
            for(int k = i; k<5 ; k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
