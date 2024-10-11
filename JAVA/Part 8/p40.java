/*Write a program that counts the occurrences of words in
a text and displays the words and their occurrences in
alphabetical order of the words. Using Map and Set
Classes. */
import java.util.*;

public class p40 {
    public static void main(String[] args) {
        String text = "This is a sample text. This text is just a sample.";
        Map<String, Integer> wordCountMap = countWords(text);
        displayWordCount(wordCountMap);
    }

    public static Map<String, Integer> countWords(String text) {
        String[] words = text.toLowerCase().split("\\s+");
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                int count = wordCountMap.get(word) + 1;
                wordCountMap.put(word, count);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        return wordCountMap;
    }

    public static void displayWordCount(Map<String, Integer> wordCountMap) {
        Set<String> wordSet = new TreeSet<>(wordCountMap.keySet());
        for (String word : wordSet) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
