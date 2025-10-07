public class SearchAlgorithm {
    // public static int linearSearch(int[] arr, int target) {
    //     for(int i = 0; i < arr.length; i++) {
    //         if(arr[i] == target) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    public static int binarySearch(int[] arr, int target) {
        int st = 0;
        int end = arr.length-1;
        while (st <= end) {
          int mid = st + (end - st) / 2;
          if(arr[mid] > target) {
            end = mid - 1;
          } else if(arr[mid] < target) {
            st = mid + 1;
          } else return mid;
        }
        return -1;
    }
    public static void main(String[] args) {
        // Linear Search
        int[] arr = { 2, 5, 12, 15, 17, 27, 29 };
        int target = 5;
        // int ans = linearSearch(arr, target);
        // System.out.println(ans);

        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
}
