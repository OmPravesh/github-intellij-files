import java.util.Scanner;
public class Inputs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        System.out.print("please enter some input: ");
//        int rollno = sc.nextInt();
//        System.out.println("Your roll number is " + rollno);

//        int num = 234_000_000;
//        System.out.println(num);

//        String name = sc.nextLine();
//        System.out.println("name");
//
//        float marks = sc.nextFloat();
//        System.out.println(marks);

//        int num = (int)(67.56f);
//        System.out.println(num);

        // automatic type promotion in expressions
        int a = 3;
        byte b = (byte)(a); // 257 % 256 = 1

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;

        System.out.println(b);

    }
}

