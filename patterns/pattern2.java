package patterns;

public class pattern2 {
    public static void main(String[] args) {
        System.out.println("Pattern 2: ");
        for(int i = 5; i>0; i--){
            for(int j = i; j<=5 ; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
