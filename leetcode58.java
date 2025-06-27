import java.util.Scanner;

public class leetcode58 {
    public static void main(String[] args) {
        String s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input: ");
        s = scanner.nextLine();

        String[] ss = s.split(" ");
        String n = ss[ss.length - 1];
        int no = n.length();
        System.out.println(n);
        System.out.println(no);
    }
}
