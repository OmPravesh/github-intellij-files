import java.util.Scanner;
public class Claculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (true) {
            // take the operator as input
            System.out.print("Enter the operator(+, -, *, /, %, or X to exit): ");
            char op = sc.next().trim().charAt(0);

            if (op == 'x' || op == 'X'){
                System.out.println("Exiting the calculator...");
                break;
            }

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                // input two numbers
                System.out.print("Enter first number: ");
                int num1 = sc.nextInt();
                System.out.print("Enter second number: ");
                int num2 = sc.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                else if (op == '*') {
                    ans = num1 * num2;
                }
                else if (op == '-') {
                    ans = num1 - num2;
                }
                else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero!");
                        continue;
                    }
                }
                else if (op == '%') {
                    ans = num1 % num2;
                }

                System.out.println(ans);
            }
            else {
                System.out.println("Invalid operation!");
            }
        }
    }
}
