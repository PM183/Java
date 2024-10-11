/*Given a string, return a string where for every char in the
original, there are two chars.
double_char('The') → 'TThhee'
double_char('AAbb') → 'AAAAbbbb'
double_char('Hi-There') → 'HHii--TThheerree' */

public class p9 {
    public static String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.charAt(i) + str.charAt(i);
        }
        return result;
    }

    public static void main(String s[]){
        System.out.println(doubleChar("The"));  // Outputs: TThhee
        System.out.println(doubleChar("AAbb"));  // Outputs: AAAAbbbb
        System.out.println(doubleChar("Hi-There"));  // Outputs: HHii--TThheerree
    }
}