import java.util.Scanner;
import java.util.Arrays;

public class JobSequencing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Job Sequencing with Deadline ---");
        System.out.print("Enter the number of jobs: ");
        int n = scanner.nextInt();

        int[][] jobs = new int[n][3];
        int maxDeadline = 0;

        for (int i = 0; i < n; i++) {
            jobs[i][0] = i + 1;
            System.out.print("Enter deadline for job " + (i + 1) + ": ");
            jobs[i][1] = scanner.nextInt();
            System.out.print("Enter profit for job " + (i + 1) + ": ");
            jobs[i][2] = scanner.nextInt();
            if (jobs[i][1] > maxDeadline) {
                maxDeadline = jobs[i][1];
            }
        }

        Arrays.sort(jobs, (a, b) -> b[2] - a[2]);

        int[] result = new int[maxDeadline + 1];
        boolean[] slot = new boolean[maxDeadline + 1];
        int totalProfit = 0;

        for (int i = 0; i < n; i++) {
            for (int j = Math.min(maxDeadline, jobs[i][1]); j > 0; j--) {
                if (!slot[j]) {
                    result[j] = jobs[i][0];
                    slot[j] = true;
                    totalProfit += jobs[i][2];
                    break;
                }
            }
        }

        System.out.println("\nJob Sequence for Maximum Profit:");
        for (int i = 1; i <= maxDeadline; i++) {
            if (slot[i]) {
                System.out.print("J" + result[i] + " ");
            }
        }
        System.out.println("\nMaximum Profit: " + totalProfit);
        scanner.close();
    }
}