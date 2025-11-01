import java.util.ArrayList;
import java.util.Arrays;
public class SizeOfCollection {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(23);
        list1.add(34);
        list1.add(56);
        list1.add(12);
        list1.add(45);
        System.out.println("Original List: " + list1);
        int count = 0;
        for (int num : list1){
            count++;
        }
        System.out.println("size:" + count);
        System.out.println(list1.size());

    }
    }

