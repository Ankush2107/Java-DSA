public class interpolationSearch {
    public static int interpolation(int[] arr, int target) {
        int st = 0; 
        int end = arr.length-1;
        int ans = -1;
        while (st <= end) {
            int pos = st + (target - arr[st]) * (end - st)/(arr[end] - arr[st]);
            if(arr[pos] == target){ 
                ans = pos;
                break;
            }
            else if (target < arr[pos]) {
                end = pos - 1;
            }
            else {
                st = pos + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;
        int result = interpolation(arr, target);
        System.out.println(result);
    }
}
