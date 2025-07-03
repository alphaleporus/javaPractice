import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arrayList2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(50);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);

        numbers.size();
        System.out.print("Unsorted: ");
        for(int number : numbers){
            System.out.print(number + " ");
        }
        System.out.println();
        Collections.sort(numbers);
        System.out.print("Sorted(Ascending): ");
        for(int number : numbers){
            System.out.print(number + " ");
        }
        System.out.println();

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.print("Sorted(Descending): ");
        for(int number : numbers){
            System.out.print(number + " ");
        }
    }
}
