import java.util.Scanner;
public class FindTheMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
        for(int i = 0; i< arr.length; i++){
            if ((i+1) != arr[i]){
                System.out.print((i+1) + " ");
                i++;
            }
        }


    }
}
