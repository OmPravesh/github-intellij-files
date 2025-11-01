import java.util.Scanner;

class Solution {

    // Function to solve Tower of Hanoi and return total moves
    public int towerOfHanoi(int n, int from, int to, int aux) {
        if (n == 0) {
            return 0;
        }
        int moves = 0;
        moves += towerOfHanoi(n - 1, from, aux, to); // move n-1 disks
        moves++; // move the nth disk
        moves += towerOfHanoi(n - 1, aux, to, from); // move n-1 disks again
        return moves;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();

        int totalMoves = sol.towerOfHanoi(n, 1, 3, 2);
        System.out.println(totalMoves);

        sc.close();
    }
}

