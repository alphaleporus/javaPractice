import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {

//        Instantiating ArrayList
        ArrayList<String> cars = new ArrayList<>();

//        Adding elements
        cars.add("Mazda");
        cars.add("Audi");
        cars.add("Mercedes");
        cars.add("Figo");

//        Printing ArrayList
        System.out.println(cars);

//        Adding element at the first place
        cars.add(0,"Hyundai");
        String name = cars.get(0);
        System.out.println(name);

//        Changing first element
        cars.set(0, "McLaren");
        String name2 = cars.get(0);
        System.out.println(name2);

//        Checking the size of ArrayList
        System.out.println(cars.size());

//        Looping through ArrayList
        for(int i =0 ; i<cars.size(); i++){
            System.out.print(cars.get(i) + " ");
        }
        System.out.println();

//        For-each Loop
        for(String car : cars){
            System.out.println(car);
        }

//        Removing and clearing elements
        cars.remove(2);
        System.out.println(cars);
        cars.clear();
        System.out.println(cars);


    }
}
