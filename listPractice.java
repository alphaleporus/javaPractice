import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class listPractice {
    public static void main(String[] args) {
        List<String> activities = new LinkedList<>();
        activities.add("Running");
        activities.add("Badminton");
        activities.add("Coding");
        activities.add("Baking");
        activities.add("Running");
        activities.add("Swimming");

        System.out.println("The " + activities.size() + " activities(unsorted) are:-");
        for(int i = 0; i < activities.size(); i++){
            System.out.println(i+1 + ". " + activities.get(i));
        }
        System.out.println();

        Collections.sort(activities);

        System.out.println("The " + activities.size() + " activities(sorted) are:-");
        for(int i = 0; i < activities.size(); i++){
            System.out.println(i+1 + ". " + activities.get(i));
        }
        activities.removeFirst();
        System.out.println();
        System.out.println("The " + activities.size() + " activities after removing the first one are:-");
        for(int i = 0; i < activities.size(); i++){
            System.out.println(i+1 + ". " + activities.get(i));
        }
    }
}
