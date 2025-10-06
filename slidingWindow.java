public class slidingWindow {
    public static int findMaxSumOfSubArray(int arr[], int k) {
        if(arr.length < k) {   // Base case
            System.out.println("Array size is smaller than the window size");
        }
        int maxSum = 0;
        int windowSum = 0;

        // loop starts 0 and end it k
        for(int i = 0; i < k; i++) {
            windowSum += arr[i]; // windowSum = windowSum + arr[i]
        }
        maxSum = windowSum;

        for(int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int nums[] = { 2, 8, 6, 7, 3 , 1, 5 };
        int k = 4;
        System.out.println(findMaxSumOfSubArray(nums, k));
    }
}
