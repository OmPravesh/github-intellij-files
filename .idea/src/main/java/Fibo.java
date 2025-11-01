import java.util.Scanner;

public class Fibo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = 0;
        int b = 1;
        if(n == 0){
            System.out.println(0);
        }
        else if (n == 1){
            System.out.println(1);
        }
        int count = 2;
        while (count <= n) {
            int temp = b;
            b = b+p;
            p = temp;
            System.out.print(b + " ");
            count++;
        }

        System.out.println(b);
    }
}
