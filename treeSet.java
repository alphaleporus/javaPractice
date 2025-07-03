import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(101);
        numbers.add(121);
        numbers.add(123);
        numbers.add(111);
        numbers.add(121);
        numbers.add(131);
        numbers.add(121);

        System.out.println("There are "+ numbers.size() + " unique numbers");
        System.out.println("Unique numbers in order are: "+ numbers);
    }
}
