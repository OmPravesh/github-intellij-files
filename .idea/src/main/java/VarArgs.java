import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args){
//        fun(2, 3, 4, 5, 56, 87, 23, 45, 65);
//        multiple(2,3, "Om", "Aman", "sam");
//        int ans = sum(3, 4);
//        System.out.println(ans);
        demo("Om Pravesh", "Ayush", "Keshav", "Manipal");
    }

//    static int sum(int a, int b){
//        return a + b;
//    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

//    static int sum(int a, int b, int c){
//        return a + b;
//    }

    static void fun(int a) {
        System.out.println("first one");
        System.out.println(a);
    }

//    static void multiple(int a, int b, String ...v){
//        System.out.println(a + " " + b + " " + Arrays.toString(v));
//    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
