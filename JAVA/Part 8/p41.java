/*Write a code which counts the number of the keywords in
a Java source file. Store all the keywords in a HashSet
and use the contains () method to test if a word is in the
keyword set. */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p41 {
    private static final Set<String> KEYWORDS = new HashSet<>();

    static {
        KEYWORDS.add("abstract");
        KEYWORDS.add("assert");
        KEYWORDS.add("boolean");
        KEYWORDS.add("break");
        KEYWORDS.add("byte");
        KEYWORDS.add("case");
        KEYWORDS.add("catch");
        KEYWORDS.add("char");
        KEYWORDS.add("class");
        KEYWORDS.add("const");
        KEYWORDS.add("continue");
        KEYWORDS.add("default");
        KEYWORDS.add("do");
        KEYWORDS.add("double");
        KEYWORDS.add("else");
        KEYWORDS.add("enum");
        KEYWORDS.add("extends");
        KEYWORDS.add("final");
        KEYWORDS.add("finally");
        KEYWORDS.add("float");
        KEYWORDS.add("for");
        KEYWORDS.add("goto");
        KEYWORDS.add("if");
        KEYWORDS.add("implements");
        KEYWORDS.add("import");
        KEYWORDS.add("instanceof");
        KEYWORDS.add("int");
        KEYWORDS.add("interface");
        KEYWORDS.add("long");
        KEYWORDS.add("native");
        KEYWORDS.add("new");
        KEYWORDS.add("package");
        KEYWORDS.add("private");
        KEYWORDS.add("protected");
        KEYWORDS.add("public");
        KEYWORDS.add("return");
        KEYWORDS.add("short");
        KEYWORDS.add("static");
        KEYWORDS.add("strictfp");
        KEYWORDS.add("super");
        KEYWORDS.add("switch");
        KEYWORDS.add("synchronized");
        KEYWORDS.add("this");
        KEYWORDS.add("throw");
        KEYWORDS.add("throws");
        KEYWORDS.add("transient");
        KEYWORDS.add("try");
        KEYWORDS.add("void");
        KEYWORDS.add("volatile");
        KEYWORDS.add("while");
    }

    public static void main(String[] args) {
        File file = new File("p40.java"); // replace with your Java source file
        try (Scanner scanner = new Scanner(file)) {
            int keywordCount = 0;
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (KEYWORDS.contains(word)) {
                    keywordCount++;
                }
            }
            System.out.println("Number of keywords: " + keywordCount);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }
}
