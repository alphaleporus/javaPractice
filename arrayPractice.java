public class arrayPractice {
    public static void main(String[] args) {

//        Creating an Array
        String[] friends = {"Gaurav", "Ram", "Shyam", "Ghasitaram"};
        System.out.println("The length od this array is " + friends.length);

//        For-loop
        for(int i = 0 ; i <= friends.length; i++){
            System.out.print(friends[i] + ", ");
        }

    }
}
