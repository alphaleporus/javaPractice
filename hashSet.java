import java.util.HashSet;
import java.util.Scanner;

public class hashSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence to check for unique words in it: ");
        String sentence = scanner.nextLine();
        String[] wordss = sentence.split(" ");
        HashSet<String>words = new HashSet<>();
        for(String w : wordss){
            words.add(w);
        }
        System.out.print("Unique words: " + words);
        System.out.print("Enter the word you wanna check for: ");
        String check = scanner.next();
        if(words.contains(check)){
            System.out.println(true);
        }
        System.out.print("Enter a word you want to remove: ");

        String remove = scanner.next();
        boolean isRemoved = false;
        if(words.contains(remove)){
            words.remove(remove);
            isRemoved = true;
        }
        System.out.println("Removed " + "'" + remove +"':"+ isRemoved);
        System.out.println("Size: " + words.size());
        words.clear();
        System.out.println("After clear: " + words);
    }
}
