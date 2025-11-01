import java.util.HashMap;

public class SearchInHashMap {
    public static void main(String[] args) {
        // Create a HashMap with String keys and Integer values
        HashMap<String, Integer> studentScores = new HashMap<>();

        // Add some key-value pairs
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 88);
        studentScores.put("Charlie", 76);
        studentScores.put("Diana", 92);

        // Define the key to search for
        String keyToSearch = "Bob";

        System.out.println("Searching for key: '" + keyToSearch + "'...");

        // Check if the HashMap contains the key
        if (studentScores.containsKey(keyToSearch)) {
            // If the key exists, get its value and print it
            int value = studentScores.get(keyToSearch);
            System.out.println("Key found! The value is: " + value);
        } else {
            // If the key does not exist, print a message
            System.out.println("Key not found in the HashMap.");
        }

        // Example of a key that doesn't exist
        String missingKey = "Eve";
        System.out.println("\nSearching for key: '" + missingKey + "'...");
        if (studentScores.containsKey(missingKey)) {
            int value = studentScores.get(missingKey);
            System.out.println("Key found! The value is: " + value);
        } else {
            System.out.println("Key not found in the HashMap.");
        }
    }
}