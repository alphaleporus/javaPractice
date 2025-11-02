import java.util.*;

public class TSPBranchAndBound {
    private static final int INF = Integer.MAX_VALUE / 2; // Using a large number for Infinity
    private int N;
    private int[][] adj;
    private int minCost = INF;
    private List<Integer> finalPath;

    public void solve() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of cities (N): ");
        N = scanner.nextInt();
        adj = new int[N][N];

        System.out.println("Enter the distance matrix (use " + INF + " or a very large number for no direct path):");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("Distance from city %d to city %d: ", i, j);
                adj[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        // Start from City 0
        List<Integer> currentPath = new ArrayList<>();
        currentPath.add(0);
        boolean[] visited = new boolean[N];
        visited[0] = true;

        branchAndBound(0, 1, 0, currentPath, visited);

        System.out.println("\n--- Results ---");
        System.out.println("Optimal TSP Tour Cost: " + minCost);
        System.out.print("Optimal Tour Path: ");
        if (finalPath != null) {
            for (int i = 0; i < finalPath.size(); i++) {
                System.out.print(finalPath.get(i) + (i < finalPath.size() - 1 ? " -> " : ""));
            }
            System.out.println();
        } else {
            System.out.println("No valid tour found.");
        }
    }

    private void branchAndBound(int currentCity, int count, int currentCost, List<Integer> currentPath, boolean[] visited) {
        // Simple bounding condition: if the current cost already exceeds the best known cost, prune.
        if (currentCost >= minCost) {
            return;
        }

        // Base Case: All cities visited
        if (count == N) {
            // Check the edge back to the start city (City 0)
            int costToReturn = adj[currentCity][0];
            if (costToReturn != INF) {
                int totalCost = currentCost + costToReturn;
                if (totalCost < minCost) {
                    minCost = totalCost;
                    finalPath = new ArrayList<>(currentPath);
                    finalPath.add(0); // Complete the cycle
                }
            }
            return;
        }

        for (int nextCity = 0; nextCity < N; nextCity++) {
            if (!visited[nextCity] && adj[currentCity][nextCity] != INF) {

                visited[nextCity] = true;
                currentPath.add(nextCity);

                branchAndBound(nextCity, count + 1, currentCost + adj[currentCity][nextCity], currentPath, visited);

                visited[nextCity] = false;
                currentPath.remove(currentPath.size() - 1);
            }
        }
    }
    public static void main(String[] args) {
        new TSPBranchAndBound().solve();
    }
}