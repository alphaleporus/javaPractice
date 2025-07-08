package Recursion;

public class oneToN {
    static int limit = 1;
    static void printNum(){
        if(limit==21)return;
        System.out.println(limit);
        limit++;
        printNum();
    }

    public static void main(String[] args) {
        printNum();
    }
}
