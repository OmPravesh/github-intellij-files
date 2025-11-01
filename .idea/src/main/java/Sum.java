import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
//        int ans = sum2();
//        System.out.println(ans);
        int ans = sum3(20, 30);
        System.out.println("The answer is: " + ans );
    }

    // pass the value of number when you are calling the method in main()
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }

    // return the value
    static int sum2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2:");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2:");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }

    /*
        return_type name () {
            // body
            return statement;
        }

    */
}
