import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Create array of size 10
//        int[] arr = new int[10];
//
//        // Input numbers
//        System.out.println("Enter 10 numbers:");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        // Initialize min and max with first element
//        int min = arr[0];
//        int max = arr[0];
//
//        // Traverse array to find min and max
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//
//        System.out.println("Minimum element: " + min);
//        System.out.println("Maximum element: " + max);
//
//        sc.close();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the element: ");
        int num = sc.nextInt();
        int [] arr = new int[num];
        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter the " + i + "th element");
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i< arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("The min value in the array is : " + min);
        System.out.println("The max value in the array is: " + max);

    }
}
