import java.util.Scanner;

public class FindNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for array length
        System.out.print("Enter the length of the array: ");
        int num = sc.nextInt();

        // Create the array
        int[] arr = new int[num];

        // Input array elements
        for (int i = 0; i < num; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Ask user for number to search
        System.out.print("Enter the number to search: ");
        int target = sc.nextInt();

        // Search for the number
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Number found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Number not found in the array.");
        }

        sc.close(); // Close the scanner
    }
}
