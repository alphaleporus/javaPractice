public class TwoDimentionalArrayPhonePad {
    public static void main(String[] args){
        char[][] phonePad = {{'1','2','3'},{'4','5','6'},{'7','8','9'},{'*','0','#'}};
        for(char[] nums : phonePad){
            for(char num : nums ){
                System.out.print(num + "  ");
            }
            System.out.println();
        }
    }
}
