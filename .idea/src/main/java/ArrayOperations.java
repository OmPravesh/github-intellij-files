import java.util.ArrayList;
import java.util.Collections;

public class ArrayOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        System.out.println("Original List: " + list1);
        System.out.print("Elements: ");
        for (int num : list1) {
            System.out.print(num + " ");
        }
        System.out.println();
        list1.remove(2);
        System.out.println("After removing 3rd element: " + list1);
        list1.set(1, 99);
        System.out.println("After replacing 2nd element: " + list1);
        int checkValue = 40;
        boolean found = list1.contains(checkValue);
        System.out.println("Is " + checkValue + " present? " + found);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(15);
        list2.add(25);
        list1.addAll(list2);
        System.out.println("Merged List: " + list1);
        Collections.sort(list1);
        System.out.println("Sorted Merged List: " + list1);
    }
}
