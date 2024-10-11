/*Write a program to increment the value of one variable by one and display it after 
one second using thread using sleep() method. */
public class p35 {

    static class IncrementThread extends Thread {
        private int count = 0;

        @Override
        public void run() {
            while (true) {
                count++;
                System.out.println("Count: " + count);

                try {
                    Thread.sleep(10); // Sleep for 1 second
                } catch (InterruptedException e) {
                    // Handle exception
                }
            }
        }
    }

    public static void main(String[] args) {
        IncrementThread thread = new IncrementThread();
        thread.start();
    }
}
