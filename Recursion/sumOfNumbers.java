package Recursion;

public class sumOfNumbers {

    static int addNum(int num, int numin){
        if(num>numin)return 0;
        return num + addNum(num+1, numin);
    }

    public static void main(String[] args) {
        int sum = addNum(1, 5);
        System.out.println("The sum is "+ sum);
    }
}
