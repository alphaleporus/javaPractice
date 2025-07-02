package patterns;

public class pattern19 {
    public static void main(String[] args) {
        System.out.println("Pattern 19: ");

        for(int a = 0; a<5; a++){
            for (int b = 5; b>a; b--){
                System.out.print("*");
            }
            for(int c = a; c>=1; c-- ){
                System.out.print(" ");
            }
            for(int d = a; d>=1; d--){
                System.out.print(" ");
            }
            for(int e = a; e<5; e++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<5;i++){
            for (int j = i; j>=0; j--){
                System.out.print("*");
            }
            for(int k = i ;k<4; k++){
                System.out.print(" ");
            }
            for(int l = i; l<4 ; l++){
                System.out.print(" ");
            }
            for(int m = i; m>=0; m--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
