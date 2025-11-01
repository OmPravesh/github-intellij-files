public class Fibonacci {

    public int nthFibonacci(int n){
        if (n==0) return 0;
        if (n==1) return 1;
        return nthFibonacci(n-1) + nthFibonacci(n-2);
    }
    public static void main(String[] args){
        Fibonacci f = new Fibonacci();
        int n = 6;
        System.out.println(f.nthFibonacci(n));

    }
}
