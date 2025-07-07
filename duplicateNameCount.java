import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class duplicateNameCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many names do you wish to enter? ");
        int num = scanner.nextInt();
        scanner.nextLine();
        int i =0;

        ArrayList<String> names = new ArrayList<>();
        System.out.println("Enter the names:- ");
        while(i<num){
            String name = scanner.nextLine().toLowerCase();
            names.add(name);
            i++;
        }

        TreeMap<String, Integer>count = new TreeMap<>();

        for(String n: names){
            count.put(n , count.getOrDefault(n , 0)+1);
        }

        for(String c : count.keySet()){
            System.out.println(c + " -> " + count.get(c));
        }
        scanner.close();
    }
}
