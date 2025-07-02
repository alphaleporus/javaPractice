package patterns;

public class pattern9 {
    public static void main(String[] args) {
        System.out.println("Pattern 9: ");
        for(int i = 5; i>0; i--){
            for(int j = i; j>0 ;j--){
                System.out.print(" ");
            }
            for(int k = i; k<=5;k++){
                System.out.print("*");
            }
            for(int l = i; l<5 ; l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int a = 1; a<=5 ; a++){
            for(int b = a; b>0; b--){
                System.out.print(" ");
            }
            for(int c = a; c<=5 ;c++){
                System.out.print("*");
            }
            for(int d = 5; d>a; d--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
