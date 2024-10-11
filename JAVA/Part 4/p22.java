/*Write a java that implements an interface AdvancedArithmetic which contains a method signature
int divisor_sum(int n). You need to write a class called MyCalculator which implements the interface.
divisor_Sum function just takes an integer as input and return the sum of all its divisors. For example, 
divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. The value of n will be at most 1000.*/

interface AdvancedArithmetic{
    public int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
public class p22 {
    public static void main(String[] args) {
        MyCalculator d = new MyCalculator();
        System.out.println(d.divisor_sum(6));
        
    }
}
