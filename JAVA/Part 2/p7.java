/*Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if
the string is less than length 3. Return n copies of the front; 
front_times('Chocolate', 2) → 'ChoCho'
front_times('Chocolate', 3) → 'ChoChoCho'
front_times('Abc', 3) → 'AbcAbcAbc'*/

public class p7 {
  public static void main(String[] args) {
    System.out.println(frontTimes("Chocolate", 2));  // Output: "ChoCho"
    System.out.println(frontTimes("Chocolate", 3));  // Output: "ChoChoCho"
    System.out.println(frontTimes("Abc", 3));  // Output: "AbcAbcAbc"
  }

  public static String frontTimes(String str, int n) {
    String front = str.substring(0, Math.min(3, str.length()));
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < n; i++) {
      result.append(front);
    }
    return result.toString();
  }
}