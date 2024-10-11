/*Imagine you are developing an e-commerce application.
The platform needs to sort lists of products based on
different criteria, such as price, rating, or name. Each
product object implements the Comparable interface to
define the natural ordering. To ensure flexibility and
reusability, you need a generic method that can sort any
array of Comparable objects. Create a generic method in
Java that sorts an array of Comparable objects. This method
should be versatile enough to sort arrays of different types
of objects (such as products, customers, or orders) as long
as they implement the Comparable interface. */

public class p39 {
    public static <T extends Comparable<T>> void sort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    T temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
