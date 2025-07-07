import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class iterator {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Enter the names : ");
        Scanner scanner = new Scanner(System.in);
        String inputNames = scanner.nextLine();
        for(String name : inputNames.split(" ")){
            names.add(name);
        }
        HashSet<String> uniqueNames = new HashSet<>();

        Iterator<String> it= names.iterator();
        while(it.hasNext()){
            String name = it.next();
            if(uniqueNames.contains(name)){
                it.remove();
            }else {
                uniqueNames.add(name);
            }
        }
        System.out.println(names);
    }
}
