public class recursion {
    public static void printNum(int count, int a, int b, int n){
        if(count > n ){
            return;
        }
        if(n == 0){
            System.out.println(0);
            return;
        }
        if(n == 1){
            System.out.println(0 + " " + 1);
            return;
        }
        int temp = a;
        a = b;
        b = temp + b;
        System.out.print(a + " " + b);
        printNum(count+1 , a, b, n);
    }

    public static void main(String[] args) {
        int count = 0;
        int n = 10;
        int a =0;
        int b = 1;
        printNum(count, a, b , n);
    }
}
