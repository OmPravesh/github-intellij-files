public class FindNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1, 8, 76, 5, 7};
        int target = 76;
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
    }
}

