import java.util.Scanner;
public class rotateKTimes {
    public static void swap(int arr[], int a, int b) {
        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }
    public static void reverse(int arr[], int start, int end) {
        while(start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    public static void rotateInPlace(int arr[], int n, int k) {
        k = k % n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }
    public static int[] rotate(int arr[], int n, int k) {
        k = k % n;
        int ans[] = new int[n];
        int j = 0;
        // n-k to n-1 in ans array
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        // 0 to n-k-1
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int originalArray[] = new int[n];
        System.out.print("Enter the element of the Array: ");
        for (int i = 0; i < n; i++) {
            originalArray[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        rotateInPlace(originalArray, n, k);
        for(int num: originalArray) {
            System.out.print(num + " ");
        }
    }
}
