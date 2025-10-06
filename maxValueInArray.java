public class maxValueInArray {
    public static int findMax(int arr[], int n) {
        int maxVal = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    public static void main(String[] args) {
        int nums[] = { 1, 12, 3, 4, 5, 6 };
        System.out.println(findMax(nums, nums.length));
    }
}