import java.util.TreeMap;

public class linkedHashMap {
    public static void main(String[] args) {
        TreeMap<Integer , String> students = new TreeMap<>();

        students.put(52 , "G");
        students.put(22 , "A");
        students.put(53 , "B");
        students.put(21 , "E");
        students.put(35 , "C");
        students.put(62 , "D");
        students.put(15 , "F");

        for(Integer student:students.keySet()){
            System.out.println(student + ". " + students.get(student));
        }

    }
}
