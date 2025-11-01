import java.util.ArrayList;
import java.util.Collection;

public class CollectionSizeChecker {
    public static void main(String[] args) {
        // Create a new ArrayList
        Collection<String> myCollection = new ArrayList<>();

        // --- Check when the collection is empty ---
        System.out.println("--- Checking the empty collection ---");
        // Verify if the collection is empty
        System.out.println("Is the collection empty? " + myCollection.isEmpty()); // Output: true
        // Get the size of the collection
        System.out.println("Size of the collection: " + myCollection.size()); // Output: 0
        System.out.println(); // for spacing

        // --- Add elements and check again ---
        System.out.println("--- Checking the collection after adding elements ---");
        myCollection.add("Apple");
        myCollection.add("Banana");
        myCollection.add("Cherry");

        // Verify if the collection is empty now
        System.out.println("Is the collection empty? " + myCollection.isEmpty()); // Output: false
        // Get the size of the collection
        System.out.println("Size of the collection: " + myCollection.size()); // Output: 3
    }
}

//import java.util.Collection;
//import java.util.ArrayList;
//
//class ColleactionSizeChecker{
//    public static void main(String[] args){
//        Collection<String> myCollection = new ArrayList<>();
//        System.out.println("Check the empty collection");
//        System.out.println("is the collection empty? " + myCollection.isEmpty());
//        System.out.println("Size of the collection: "+ myCollection.size());
//        System.out.println();
//        myCollection.add("Apple");
//        myCollection.add("Cherry");
//
//        System.out.println("Is this collection is empty? " + myCollection.isEmpty());
//        System.out.println("size of the collection: " + myCollection.size());
//    }
//}

