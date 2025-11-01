import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "Java is a programming language Java is popular and Java is versatile";

        // Create a HashMap to store words and their frequencies
        Map<String, Integer> wordFrequency = new HashMap<>();

        // Pre-process the string: convert to lower case and split into words
        String[] words = text.toLowerCase().split("\\s+"); // \\s+ splits by one or more spaces

        // Iterate over each word in the array
        for (String word : words) {
            // If the word is already in the map, increment its count
            if (wordFrequency.containsKey(word)) {
                wordFrequency.put(word, wordFrequency.get(word) + 1);
            } else {
                // If the word is not in the map, add it with a count of 1
                wordFrequency.put(word, 1);
            }
        }

        // Print the frequency of each word
        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue() + " times");
        }
    }
}
