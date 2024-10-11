/*Write a java program that implements a multi-thread application that has three threads. 
First thread generates random integer every 1 second and if the value is even, second thread 
computes the square of the number and prints. If the value is odd, the third thread will print 
the value of cube of the number. */
public class p34 {

    static class GeneratorThread extends Thread {
        private boolean stop = false;

        @Override
        public void run() {
            while (!stop) {
                int num = (int) (Math.random() * 100);
                System.out.println("Generated number: " + num);

                if (num % 2 == 0) {
                    SquareThread.square(num);
                } else {
                    CubeThread.cube(num);
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    stop = true;
                }
            }
        }

        public void stopThread() {
            stop = true;
        }
    }

    static class SquareThread {
        public static synchronized void square(int num) {
            int square = num * num;
            System.out.println("Square of " + num + ": " + square);
        }
    }

    static class CubeThread {
        public static synchronized void cube(int num) {
            int cube = num * num * num;
            System.out.println("Cube of " + num + ": " + cube);
        }
    }

    public static void main(String[] args) {
        GeneratorThread generatorThread = new GeneratorThread();
        generatorThread.start();

        try {
            Thread.sleep(10000); // Run for 10 seconds
        } catch (InterruptedException e) {
            // Handle exception
        }

        generatorThread.stopThread();
    }
}
