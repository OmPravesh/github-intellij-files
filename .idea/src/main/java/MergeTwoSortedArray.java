import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {3, 1, 7};
        int[] arr2 = {9, 2, 6};

        // Step 1: Merge
        int[] merged = new int[arr1.length + arr2.length];

        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            merged[k++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merged[k++] = arr2[i];
        }

        // Step 2: Sort using Bubble Sort (comparison-based)
        int n = merged.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (merged[j] > merged[j + 1]) {
                    // swap
                    int temp = merged[j];
                    merged[j] = merged[j + 1];
                    merged[j + 1] = temp;
                }
            }
        }

        // Step 3: Print result
        System.out.println("Merged + Sorted Array: " + Arrays.toString(merged));
    }
}
