public class TowerOFH {
    public static void main(String[] args) {
        int n = 3; // number of disks
        towerOfHanoi(n, 'A', 'C', 'B');
        // A = source, C = destination, B = auxiliary
    }

    // Recursive function
    static void towerOfHanoi(int n, char fromRod, char toRod, char auxRod) {
        // Base case
        if (n == 1) {
            System.out.println("Move disk 1 from " + fromRod + " to " + toRod);
            return;
        }

        // Step 1: Move n-1 disks from source to auxiliary
        towerOfHanoi(n - 1, fromRod, auxRod, toRod);

        // Step 2: Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + fromRod + " to " + toRod);

        // Step 3: Move n-1 disks from auxiliary to destination
        towerOfHanoi(n - 1, auxRod, toRod, fromRod);
    }
}

