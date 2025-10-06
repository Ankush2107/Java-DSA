public class targetValue {
    public static int linearSearch(int arr[], int n, int target) {
        for(int i = 0; i < n; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6 };
        int target = 15;
        System.out.println(linearSearch(nums, nums.length, target));
    }
}