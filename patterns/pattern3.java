package patterns;

public class pattern3 {
    public static void main(String[] args) {
        System.out.println("Pattern 3");
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
