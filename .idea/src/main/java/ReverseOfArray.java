import java.util.Scanner;
public class ReverseOfArray {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++){
            System.out.print("Enter the " + i + " element in the array: ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Reversed of an array");
        for (int i = length -1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
