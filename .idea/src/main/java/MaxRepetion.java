import java.util.Scanner;
public class MaxRepetion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];;
        for (int i = 0; i < num; i++){
            System.out.println("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int maxCount = 0;
        int maxNum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                        count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxNum = arr[i];
            }
        }

        System.out.println("Number with maximum repetition: " + maxNum);
        System.out.println("It appears " + maxCount + " times.");
    }
}

