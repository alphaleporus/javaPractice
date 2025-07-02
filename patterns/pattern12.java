package patterns;

public class pattern12 {
    public static void main(String[] args) {
        System.out.println("Pattern 12: ");
        int r = 1;
        for(int i = 1; i<5; i++){
            int x =1;
            int p = r;
            for (int j = i ; j>=1; j--){
                System.out.print(x);
                x++;
            }


            for(int k = 5; k-1>i ; k--){
                System.out.print(" ");
            }
            for(int l = 5; l>i ; l--){
                System.out.print(" ");
            }



            for(int m = i; m>=1 ; m--){
                System.out.print(p);
                p--;
            }
            System.out.println();
            r++;
        }
    }
}
