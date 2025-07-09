package Recursion;

public class fibonacciNumber {
    static int fibonacci(int limit){
        if(limit<=1)return limit;
        int last = fibonacci(limit -1);
        int slast = fibonacci(limit-2);
        return last+slast;
    }

    public static void main(String[] args) {
        int limit = 4;
        System.out.println(fibonacci(limit));
    }
}
