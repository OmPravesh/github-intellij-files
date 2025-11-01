public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 12, 14, 23, 34, 56};
        int target = 56;
        int ans = orderAgnosticBs(arr, target);
        System.out.println(ans);

    }
    static int orderAgnosticBs(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        boolean isAss = arr[start] < arr[end];

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAss){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target < arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
