/*Write a program to create three threads ‘FIRST’,
‘SECOND’, ‘THIRD’. Set the priority of the ‘FIRST’
thread to 3, the ‘SECOND’ thread to 5(default) and the
‘THIRD’ thread to 7. */
public class p36 {
    public static void main(String[] args) {
        Thread first = new Thread(() -> System.out.println("This is the FIRST thread"));
        Thread second = new Thread(() -> System.out.println("This is the SECOND thread"));
        Thread third = new Thread(() -> System.out.println("This is the THIRD thread"));

        first.setPriority(3);
        second.setPriority(Thread.NORM_PRIORITY); // default priority is 5
        third.setPriority(7);

        first.start();
        second.start();
        third.start();
    }
}
