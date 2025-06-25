public class enhancedForLoop {
    public static void main(String[] args){
        String[] foods = {"Pizza", "Hot dog", "Dal Baati", "Salad"};
        int i = 1;

        for(String food : foods){
            System.out.println(i+ ")" + food);
            i++;
        }
    }
}
