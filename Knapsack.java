import java.util.*;

public class Knapsack {
    static int n, W;
    static int[] wt, val;
    static int maxValBacktrack = 0;

    static void backtrack(int i, int weight, int value) {
        if (i == n) {
            if (value > maxValBacktrack) maxValBacktrack = value;
            return;
        }
        backtrack(i + 1, weight, value);
        if (weight + wt[i] <= W)
            backtrack(i + 1, weight + wt[i], value + val[i]);
    }

    static class Node implements Comparable<Node> {
        int level, profit, weight;
        double bound;
        public int compareTo(Node o) {
            return Double.compare(o.bound, bound);
        }
    }

    static double bound(Node u) {
        if (u.weight >= W) return 0;
        double profitBound = u.profit;
        int j = u.level + 1;
        int totweight = u.weight;
        while (j < n && totweight + wt[j] <= W) {
            totweight += wt[j];
            profitBound += val[j];
            j++;
        }
        if (j < n)
            profitBound += (W - totweight) * val[j] / (double) wt[j];
        return profitBound;
    }

    static int branchBound() {
        PriorityQueue<Node> Q = new PriorityQueue<>();
        Node u = new Node(), v = new Node();
        v.level = -1; v.profit = 0; v.weight = 0;
        v.bound = bound(v);
        int maxProfit = 0;
        Q.add(v);
        while (!Q.isEmpty()) {
            v = Q.poll();
            if (v.bound > maxProfit && v.level < n - 1) {
                u.level = v.level + 1;
                u.weight = v.weight + wt[u.level];
                u.profit = v.profit + val[u.level];
                if (u.weight <= W && u.profit > maxProfit)
                    maxProfit = u.profit;
                u.bound = bound(u);
                if (u.bound > maxProfit)
                    Q.add(new Node(){{
                        level = u.level; profit = u.profit;
                        weight = u.weight; bound = u.bound;
                    }});
                u.weight = v.weight;
                u.profit = v.profit;
                u.bound = bound(u);
                if (u.bound > maxProfit)
                    Q.add(new Node(){{
                        level = u.level; profit = u.profit;
                        weight = u.weight; bound = u.bound;
                    }});
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        wt = new int[n];
        val = new int[n];
        for (int i = 0; i < n; i++) val[i] = sc.nextInt();
        for (int i = 0; i < n; i++) wt[i] = sc.nextInt();
        W = sc.nextInt();
        backtrack(0, 0, 0);
        System.out.println("Backtracking Max Value: " + maxValBacktrack);
        int maxValBB = branchBound();
        System.out.println("Branch and Bound Max Value: " + maxValBB);
    }
}

