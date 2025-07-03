import java.util.LinkedList;
public class linkedList {
    public static void main(String[] args) {
        LinkedList<String>name = new LinkedList<String>();

        name.add("Dora");
        name.addFirst("Mickey");
        name.addLast("Oggy");

        System.out.println(name);

        System.out.println(name.getFirst());
        System.out.println(name.getLast());

        name.removeFirst();
        name.removeLast();

        System.out.println(name);
    }
}
