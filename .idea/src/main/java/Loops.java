import java.util.Scanner;
public class Loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of iterations: ");
//        int num = sc.nextInt();
        // Q: Print numbers from 1 to 5

//        for (int i = 1; i<= num; i++){
//            System.out.println(i);
//        }

        // while loops
        /*
        Syntax:
        while (condition) {
          // body
          }
         */

//        int num = 1;
//        while (num <= 5) {
//            System.out.println(num);
//            num++;
//        }

        // do while
        /*
        do {

        } while (condition);
         */


        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);
    }
}
