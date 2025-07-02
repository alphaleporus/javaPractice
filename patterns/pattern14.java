package patterns;

public class pattern14 {
    public static void main(String[] args) {
        System.out.println("Pattern 14: ");
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int x ;
        for(int i = 0; i <5; i++){
            x=0;
            for(int j = i; j>=0; j--){
                System.out.print(alphabets.charAt(x));
                x++;
            }
            System.out.println();
        }
    }
}
