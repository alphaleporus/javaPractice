package Recursion;

public class printNTimes {
    static int cycle = 0;
    static void print(){
        if(cycle == 3){
            return;
        }
        System.out.println(cycle);
        cycle++;
        print();
    }
    public static void main(String[] args) {
        print();
    }
}
