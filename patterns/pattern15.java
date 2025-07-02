package patterns;

public class pattern15 {
    public static void main(String[] args) {
        System.out.println("Pattern 15: ");
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int x;
        for(int i = 4; i>=0; i--){
            x=0;
            for(int j = 0; j<=i; j++){
                System.out.print(alphabets.charAt(x));
                x++;
            }
            System.out.println();
        }
    }
}
