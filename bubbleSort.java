public class bubbleSort {
    public static void bubbleSortAlgorithm(int arr[], int n) {
        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArray(int arr[]) {
        for(int num : arr) {
            System.err.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[] = { 7, 8, 3, 9, 5, 6, 1, 2, 4 };
        System.out.print("Original array: ");
        printArray(nums);
        bubbleSortAlgorithm(nums, nums.length);
        System.out.print("After sorting: ");
        printArray(nums);
    }
}
