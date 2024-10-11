/* Given an array of ints, return the number of 9's in the
array. array_count9([1, 2, 9]) → 1
array_count9([1, 9, 9]) → 2
array_count9([1, 9, 9, 3, 9]) → 3*/

import java.util.*;
public class p8 {
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number of element:");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count = array_count(arr);
        System.out.println("Number of 9's: " + count);
    }
    public static int array_count(int[] a){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==9){
                count++;
            }
        }
        return count;
    }
}