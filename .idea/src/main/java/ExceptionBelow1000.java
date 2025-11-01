import java.util.*;

class NumberBelow1000Exception extends Exception {
    public NumberBelow1000Exception(String message) {
        super(message);
    }
}

public class ExceptionBelow1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            if (n < 1000) {
                throw new NumberBelow1000Exception("Number is below 1000: " + n);
            }

            System.out.println("Number is valid: " + n);

        } catch (NumberBelow1000Exception e) {   // ✅ Correct exception type
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {     // ✅ Handle invalid input
            System.out.println("Error: Please enter a valid integer.");
        } finally {
            sc.close();
        }
    }
}
