/*Write a program which takes N and number of threads as
an argument. Program should distribute the task of
summation of N numbers amongst number of threads and
final result to be displayed on the console. */
public class p33 {

    public static void main(String[] args) throws InterruptedException {
        if (args.length != 2) {
            System.out.println("Usage: java p33 <N> <number of threads>");
            System.exit(1);
        }

        int N = Integer.parseInt(args[0]);
        int numThreads = Integer.parseInt(args[1]);

        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = i + 1; // Initialize the array with numbers from 1 to N
        }

        int chunkSize = N / numThreads;
        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = (i == numThreads - 1) ? N : (i + 1) * chunkSize;
            threads[i] = new SummationThread(numbers, start, end);
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        int sum = 0;
        for (Thread thread : threads) {
            sum += ((SummationThread) thread).getSum();
        }

        System.out.println("Final result: " + sum);
    }

    static class SummationThread extends Thread {
        private int[] numbers;
        private int start;
        private int end;
        private int sum;

        public SummationThread(int[] numbers, int start, int end) {
            this.numbers = numbers;
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            for (int i = start; i < end; i++) {
                sum += numbers[i];
            }
        }

        public int getSum() {
            return sum;
        }
    }
}
