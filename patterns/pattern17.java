package patterns;

public class pattern17 {
    public static void main(String[] args) {
        System.out.println("Pattern 17: ");
        String alphabets = "ABCDE";
        int a;
        int b=-1;

        for(int i = 0; i<4;i++){
            a = 0;
            int r = b;

            for(int j= i; j<4;j++){
                System.out.print(" ");
            }
            for(int k = 0; k<=i; k++){
                System.out.print(alphabets.charAt(a));
                a++;
            }
            for(int l = 0; l<i;l++){
                System.out.print(alphabets.charAt(r));
                r--;
            }
            System.out.println();
            b=b+1;
        }
    }
}