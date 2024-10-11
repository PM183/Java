/*Write a program to create thread which display “Hello
World” message. A. by extending Thread class B. by using
Runnable interface. */

public class p32 {

    // Method A: By extending Thread class
    static class HelloWorldThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hello World (by extending Thread class)");
        }
    }

    // Method B: By using Runnable interface
    static class HelloWorldRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello World (by using Runnable interface)");
        }
    }

    public static void main(String[] args) {
        // Create and start a thread by extending Thread class
        HelloWorldThread thread = new HelloWorldThread();
        thread.start();

        // Create and start a thread by using Runnable interface
        Runnable runnable = new HelloWorldRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
}
