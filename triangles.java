public class triangles { // Corrected class name to follow Java naming conventions (PascalCase)
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int k = 9; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int l = 0; l+1 < i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int a=1; a<12;a++){
            for(int b = 1; b<a ;b++){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }

}
