public class lc560TestCaseContribution {
    public static void main(String[] args) {
        int n = 100000;
        int k = 10000;

        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print("1");
            if (i < n - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");

        System.out.println(k);
    }
}
