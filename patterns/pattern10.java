package patterns;

public class pattern10 {
    public static void main(String[] args) {
        System.out.println("Pattern 10: ");
        for(int i = 1; i <=5 ; i++){
            for(int j = 1;j <=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int a = 1; a <=5; a++){
            for(int k = a; k<5;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
