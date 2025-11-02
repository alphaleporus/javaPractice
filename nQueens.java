import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class nQueens {

    public static void solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        List<List<String>> allSolutions = new ArrayList<>();
        backtrack(n, 0, board, allSolutions);
        printSolutions(allSolutions);
    }

    private static void backtrack(int n, int row, char[][] board, List<List<String>> allSolutions) {
        if (row == n) {
            allSolutions.add(formatSolution(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, board, n)) {
                board[row][col] = 'Q';
                backtrack(n, row + 1, board, allSolutions);
                board[row][col] = '.';
            }
        }
    }

    private static boolean isSafe(int row, int col, char[][] board, int n) {
        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        int r = row - 1;
        int c = col - 1;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == 'Q') {
                return false;
            }
            r--;
            c--;
        }

        // Check upper-right diagonal
        r = row - 1;
        c = col + 1;
        while (r >= 0 && c < n) {
            if (board[r][c] == 'Q') {
                return false;
            }
            r--;
            c++;
        }

        return true;
    }

    private static List<String> formatSolution(char[][] board) {
        List<String> solution = new ArrayList<>();
        for (char[] row : board) {
            solution.add(new String(row));
        }
        return solution;
    }

    private static void printSolutions(List<List<String>> allSolutions) {
        System.out.println("Total solutions found: " + allSolutions.size() + "\n");
        int count = 1;
        for (List<String> solution : allSolutions) {
            System.out.println("Solution " + count + ":");
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
            count++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value for N (e.g., 4 or 8): ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n >= 1) {
                solveNQueens(n);
            } else {
                System.out.println("N must be a positive integer.");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        scanner.close();
    }
}