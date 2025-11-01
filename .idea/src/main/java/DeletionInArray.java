import java.util.Scanner;
public class DeletionInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter position to delete (0 to " + (size - 1) + "): ");
        int pos = sc.nextInt();
        if (pos < 0 || pos >= size) {
            System.out.println("Invalid position!");
        } else {
            for (int i = pos; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
            System.out.println("Array after deletion:");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
