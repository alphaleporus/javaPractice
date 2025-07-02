package patterns;

public class pattern13 {
    public static void main(String[] args) {
        System.out.println("Pattern 13: ");
        int x = 1;
        for(int i = 1; i<=5; i++){
            for(int j = i; j>=1; j--){
                System.out.print(x+ " ");
                x++;
            }
            System.out.println();
        }
    }
}
