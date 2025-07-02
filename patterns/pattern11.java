package patterns;

public class pattern11 {
    public static void main(String[] args) {
        int x =0;
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j >= 1; j--) {
                if(x==0){
                    x+=1;
                }else{
                    x-=1;
                }
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }
}
