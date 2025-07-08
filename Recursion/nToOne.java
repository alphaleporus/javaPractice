package Recursion;

public class nToOne {
    static int limit = 20;
    static void printRevNum(){
        if(limit == 0)return;
        System.out.println(limit);
        limit--;
        printRevNum();
    }

    public static void main(String[] args) {
        printRevNum();
    }
}
