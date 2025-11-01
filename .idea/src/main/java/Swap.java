public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//        int temp = a;
//        a = b;
//        b = temp;

        swap(a, b);

        String name = "Om Pravesh";
        changeName(name);
        System.out.println(name);
        int num = 50;
    }

    static void changeName(String naam) {
        naam = "Akash";
        int a = 10;
        int b = 20;
        {
 //           int a = 78; // already initialised outside the block in the same method, hence you cannot initialise again
            a = 100; // reassign the origin ref variable to some other value
            System.out.println(a);
            int c = 99;
            // values initialised in this block, will remain in the block
        }
        System.out.println(a);
        //System.out.println(c); // cannot use outside the block

        // scoping in the loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90;
            a = 10000;
        }
        // System.out.println(i);

    }


    static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // this change will only be valid in this function scope only.
        System.out.println(num1 + " " + num2);
    }
}
