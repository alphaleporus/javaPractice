package patterns;

public class pattern22 {
    public static void main(String[] args) {
        System.out.println("Pattern 22: ");
        for (int i = 0; i<7; i++){
            for(int j = 0; j<7; j++){
                if(i==0||i==6||j==0||j==6) {
                    System.out.print("4" + " ");
                } else if (i==1||i==5||j==1||j==5) {
                    System.out.print("3" + " ");
                } else if (i==2||i==4||j==2||j==4) {
                    System.out.print("2"+ " ");
                } else {
                    System.out.print("1"+ " ");
                }
            }
            System.out.println();
        }
    }
}
