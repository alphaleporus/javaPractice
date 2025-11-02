import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class SchedulingComparison {

    static class Task {
        int id;
        long executionTime, deadline;

        Task(int id, long executionTime, long deadline) {
            this.id = id;
            this.executionTime = executionTime;
            this.deadline = deadline;
        }
    }

    static class EDFScheduler {
        private final PriorityQueue<Task> readyQueue;

        EDFScheduler(List<Task> tasks) {
            readyQueue = new PriorityQueue<>(Comparator.comparingLong(t -> t.deadline));
            readyQueue.addAll(tasks);
        }

        void simulate() {
            long currentTime = 0;
            while (!readyQueue.isEmpty())
                currentTime += readyQueue.poll().executionTime;
        }
    }

    static class DataPoint {
        double x, y;
        int clusterId;

        DataPoint(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    static class KMeans {
        private final List<DataPoint> points, centroids;
        private final int K, iterations;

        KMeans(List<DataPoint> points, int K, int iterations) {
            this.points = points;
            this.K = K;
            this.iterations = iterations;
            this.centroids = new ArrayList<>();
            initializeCentroids();
        }

        private void initializeCentroids() {
            Collections.shuffle(points);
            for (int i = 0; i < K; i++)
                centroids.add(new DataPoint(points.get(i).x, points.get(i).y));
        }

        private double distance(DataPoint a, DataPoint b) {
            double dx = a.x - b.x, dy = a.y - b.y;
            return Math.sqrt(dx * dx + dy * dy);
        }

        private void assignPoints() {
            for (DataPoint p : points) {
                double minDist = Double.MAX_VALUE;
                int bestCluster = 0;
                for (int i = 0; i < K; i++) {
                    double d = distance(p, centroids.get(i));
                    if (d < minDist) {
                        minDist = d;
                        bestCluster = i;
                    }
                }
                p.clusterId = bestCluster;
            }
        }

        private void updateCentroids() {
            double[] sumX = new double[K], sumY = new double[K];
            int[] count = new int[K];

            for (DataPoint p : points) {
                sumX[p.clusterId] += p.x;
                sumY[p.clusterId] += p.y;
                count[p.clusterId]++;
            }

            for (int i = 0; i < K; i++)
                if (count[i] > 0) {
                    centroids.get(i).x = sumX[i] / count[i];
                    centroids.get(i).y = sumY[i] / count[i];
                }
        }

        void cluster() {
            for (int i = 0; i < iterations; i++) {
                assignPoints();
                updateCentroids();
            }
        }
    }

    private static List<Task> generateTasks(int count) {
        List<Task> tasks = new ArrayList<>();
        long time = 1000;
        ThreadLocalRandom rand = ThreadLocalRandom.current();
        for (int i = 0; i < count; i++) {
            tasks.add(new Task(i,
                    rand.nextLong(10, 50),
                    time + rand.nextLong(50, 200)));
            time += 10;
        }
        return tasks;
    }

    private static List<DataPoint> generateData(int count) {
        List<DataPoint> data = new ArrayList<>();
        ThreadLocalRandom rand = ThreadLocalRandom.current();
        for (int i = 0; i < count; i++)
            data.add(new DataPoint(rand.nextDouble(0, 100), rand.nextDouble(0, 100)));
        return data;
    }

    public static void main(String[] args) {
        final int EDF_TASK_COUNT = 100_000;
        final int KMEANS_DATA_COUNT = 50_000;
        final int K = 5, ITER = 10;

        System.out.println("Starting Algorithm Comparison Simulation...\n");

        // EDF Scheduling
        List<Task> tasks = generateTasks(EDF_TASK_COUNT);
        long startEDF = System.nanoTime();
        new EDFScheduler(tasks).simulate();
        long endEDF = System.nanoTime();
        System.out.printf("EDF Scheduling Time (O(N log N)): %.2f ms%n%n",
                (endEDF - startEDF) / 1e6);

        System.out.println("------------------------------------------------------\n");

        // K-Means Clustering
        List<DataPoint> data = generateData(KMEANS_DATA_COUNT);
        long startKMeans = System.nanoTime();
        new KMeans(data, K, ITER).cluster();
        long endKMeans = System.nanoTime();
        System.out.printf("K-Means Clustering Time (O(I*N*K*D)): %.2f ms%n",
                (endKMeans - startKMeans) / 1e6);
    }
}