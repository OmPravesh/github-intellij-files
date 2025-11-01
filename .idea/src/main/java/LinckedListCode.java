import java.util.LinkedList;

import static javax.swing.UIManager.get;

public class LinckedListCode {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.addFirst(10);
        list1.addLast(45);
        list1.add(23);
        list1.add(12);
        list1.removeFirst();
        list1.removeLast();
        list1.add(2,12);
        System.out.println(get(2));
        int i = 0;
        for(int num : list1){
            System.out.println(get(i));
            i++;
        }
        int left = 0, right = list1.size() - 1;
        while (left < right) {
            // Swap elements at left and right
            int temp = list1.get(left);
            list1.set(left, list1.get(right));
            list1.set(right, temp);

            left++;
            right--;
        }
        list1.offer(10);
        list1.offer(20);
        list1.offer(30);
        System.out.println("Queue after offers: " + list1); // [10, 20, 30]

        // Peek (look at front without removing)
        System.out.println("Peek (front element): " + list1.peek()); // 10
        System.out.println("Queue after peek: " + list1); // [10, 20, 30]

        // Poll (remove front element)
        System.out.println("Poll (removed): " + list1.poll()); // removes 10
        System.out.println("Queue after poll: " + list1); // [20, 30]

        // Poll again
        System.out.println("Poll (removed): " + list1.poll()); // removes 20
        System.out.println("Queue after poll: " + list1); // [30]

        // Final peek
        System.out.println("Peek (front element): " + list1.peek()); // 30


    }
}
