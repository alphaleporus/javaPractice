package Recursion;

public class printNameNTimes {
    static int cycle = 1;
    static void printName(){
        if(cycle==6){
            return;
        }
        System.out.println(cycle + ") Gaurav" );
        cycle++;
        printName();
    }

    public static void main(String[] args) {
        printName();
    }
}
