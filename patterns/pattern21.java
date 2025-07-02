package patterns;

public class pattern21 {
    public static void main(String[] args) {
        System.out.println("Pattern 21: ");
        int height = 4;
        int width = 4;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
