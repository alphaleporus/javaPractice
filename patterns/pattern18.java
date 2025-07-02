package patterns;

public class pattern18 {
    public static void main(String[] args) {
        System.out.println("Pattern 18: ");
        String alphabets = "ABCDE";
        int a=5;

        for(int i = 0; i<=5;i++){
            int b = a;

            for(int j = i; j>=1 ; j--){
                System.out.print(alphabets.charAt(b) + " ");
                b++;
            }
            System.out.println();
            a--;

        }
    }
}
