public class sumArray {
    public static int sumOfTheArray(int arr[], int n) {
        int sum = 0;   // O(1) Constant
        for(int i = 0; i < arr.length; i++) {   // O(n) Linear
            sum += arr[i];
        }
        return sum; // O(1) Constant
    }
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5 };
        System.out.println(sumOfTheArray(nums, nums.length));
    }
}