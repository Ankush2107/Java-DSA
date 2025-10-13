public class insertionSortProblem {
    static void printArray(int[] arr) {
        for(int i: arr) {
            System.out.print(i + " ");
        }
    }
    static void insertionSort(int[] arr) {
        int n = arr.length;
        for(int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]) { 
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 4, 5, 7, 3, 1, 2 }; 
        System.out.print("Array before merge sort: ");
        printArray(arr);
        System.out.println();
        insertionSort(arr);
        System.out.print("Array before merge sort: ");
        printArray(arr);
    }
}
