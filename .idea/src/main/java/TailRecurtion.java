public class TailRecurtion {

    static int sumTailRec(int[] arr, int n, int accumulator) {
        // Base case: if no elements left
        if (n == 0) {
            return accumulator;
        }
        // Tail recursive call with updated accumulator
        return sumTailRec(arr, n - 1, accumulator + arr[n - 1]);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};

        int sum = sumTailRec(arr, arr.length, 0);

        System.out.println("Sum of array elements: " + sum);
    }
}
