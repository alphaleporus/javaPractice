import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String , String> capitalCities = new HashMap<>();

        capitalCities.put("India", "New Delhi");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("Bangladesh" , "Dhaka");
        capitalCities.put("France", "Paris");
        capitalCities.put("Malaysia" , "Kuala Lumpur");

        String city = capitalCities.get("Malaysia");
        System.out.println(city);
        System.out.println();

        capitalCities.remove("Malaysia");
        int size = capitalCities.size();
        System.out.println(size);
        System.out.println();
        for(String cities : capitalCities.keySet()){
            System.out.println("The capital of " + cities + " is " + capitalCities.get(cities));
        }
    }
}
