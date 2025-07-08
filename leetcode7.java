public class leetcode7 {
    public static void main(String[] args) {
        int x = 1534236469;
        int y=0;
        int z;
        while(x!=0){

            z= x%10;
            if(y > 214748364 || (y== 214748364 && z >7 )) {
                System.out.println("0");
                return;
            }
            if(y<-214748364 ||(y==-214748364 && z<-8)){
                System.out.println("0");
                return;
            }
            y= 10 * y + z;
            x= x/10;

        }


            System.out.println(y);

    }
}
