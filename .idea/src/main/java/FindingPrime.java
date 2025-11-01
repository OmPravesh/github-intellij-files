import java.util.Scanner;

public class FindingPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of arr: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        int count = 0;

        System.out.println("Enter the elements: ");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < length; i++) {
            if (isPrime(arr[i])) {
                System.out.println(arr[i] + " is मुख्य ⭐");
                count++;
            } else {
                System.out.println(arr[i] + " is not मुख्य");
            }
        }
        System.out.println(count);

        sc.close();
    }
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
