public class NestedRec {
    int count = 0;
    static int nR(int n){

        if(n >100){
            return n-10;
        }
        return nR(nR(n+11));

    }
    public static void main(String[] args) {
        int num = 95;
        nR(num);

    }
}
