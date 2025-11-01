
import java.util.LinkedHashMap;

public class RemoveFromLinkedHashMap {
    public static void main(String[] args) {
        // Create a LinkedHashMap
        LinkedHashMap<Integer, String> productMap = new LinkedHashMap<>();

        // Add some mappings (key-value pairs)
        productMap.put(101, "Laptop");
        productMap.put(102, "Mouse");
        productMap.put(103, "Keyboard");
        productMap.put(104, "Monitor");

        // Print the original map (order is maintained)
        System.out.println("Original LinkedHashMap: " + productMap);

        // Define the key of the mapping to remove
        int keyToRemove = 103;

        // Remove the mapping associated with the key
        productMap.remove(keyToRemove);

        // Print the map after removal
        System.out.println("LinkedHashMap after removing key " + keyToRemove + ": " + productMap);
    }
}