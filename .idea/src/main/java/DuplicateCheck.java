import java.util.*;

class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}

public class DuplicateCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of integers: ");
            int n = sc.nextInt();

            Set<Integer> seen = new HashSet<>();
            System.out.println("Enter " + n + " integers:");

            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if (seen.contains(num)) {
                    // Throw custom exception
                    throw new DuplicateNumberException("Duplicate number found: " + num);
                }
                seen.add(num);
            }

            System.out.println("All numbers are unique ✅");

        } catch (DuplicateNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers only.");
        } finally {
            sc.close();
        }
    }
}
