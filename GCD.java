public class GCD {
    public static void main(String[] args) {
        int x1 = 30;
        int x2 = 15;

        int gcd=0;
//Brute force
        for(int i = 1; i<= Math.min(x1,x2) ; i++ ){
            if(x1%i==0&&x2%i==0){
                gcd = i;
            }
        }
        System.out.println(gcd);

//Euclidian Algorithm
        while(x2!=0){
            gcd = x2;
            x2 = x1%x2;
            x1=gcd;
        }
        System.out.println(x1);
    }
}
