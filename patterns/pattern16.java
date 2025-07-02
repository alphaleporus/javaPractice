package patterns;

public class pattern16 {
    public static void main(String[] args) {
        System.out.println("Pattern 16: ");
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int x=0;
        for(int i = 0; i < 5; i++){
            for(int j = i; j>=0; j--){
                System.out.print(alphabets.charAt(x));
            }
            System.out.println();
            x++;
        }
    }
}
