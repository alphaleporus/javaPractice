import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class BullyAlgorithm {
    static final int N = 5;
    static final int WAIT = 2000;
    static int coordinator = -1;

    static class Process {
        int id;
        boolean isUp = true;

        Process(int id) { this.id = id; }

        void startElection(List<Process> all) {
            if (!isUp) return;
            System.out.println("P" + id + " starts election...");
            boolean higherAlive = false;

            for (Process p : all)
                if (p.id > id && p.isUp) {
                    System.out.println("P" + id + " → ELECTION → P" + p.id);
                    higherAlive = true;
                }

            if (!higherAlive) becomeCoordinator(all);
            else {
                try { Thread.sleep(WAIT); } catch (Exception ignored) {}
                if (coordinator == -1 || !all.get(coordinator - 1).isUp)
                    becomeCoordinator(all);
            }
        }

        void becomeCoordinator(List<Process> all) {
            coordinator = id;
            System.out.println("\nP" + id + " becomes COORDINATOR");
            for (Process p : all)
                if (p.id != id && p.isUp)
                    System.out.println("P" + p.id + " acknowledges new coordinator " + id);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        List<Process> procs = new ArrayList<>();
        for (int i = 1; i <= N; i++) procs.add(new Process(i));
        coordinator = N;
        System.out.println("Initial Coordinator: P" + coordinator);

        // Simulate random coordinator crash
        Thread.sleep(2000);
        Process crashed = procs.get(coordinator - 1);
        crashed.isUp = false;
        System.out.println("\nP" + crashed.id + " (Coordinator) crashed!");

        // Start election from lowest process
        procs.get(0).startElection(procs);
        Thread.sleep(1000);

        System.out.println("\nFinal Coordinator: P" + coordinator);
    }
}
