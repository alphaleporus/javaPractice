import java.util.Scanner;

public class leetcode28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String needle;
        String haystack;

        System.out.print("Enter the main string: ");
        haystack = scanner.nextLine();
        System.out.print( "Enter the word you want to find: ");
        needle = scanner.nextLine();

        if(haystack.contains(needle)){
            System.out.println(haystack.indexOf(needle));
        }else{
            System.out.println(-1);
        }
    }
}

