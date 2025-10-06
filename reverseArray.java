import java.util.Arrays;
import java.util.Scanner;
public class reverseArray {
    public static int[] reverseUsingNewArray(int arr[], int size) {
        int ans[] = new int[size];
        int j = 0;
        for(int i = size-1; i >= 0; i--) {
            ans[j++] = arr[i];
        }
        return ans;
    }
    public static void reverseInExistingArray(int arr[], int size) {
        int start = 0;
        int end = size-1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int num: arr) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int originalArray[] = new int[size];
        System.out.print("Enter the element of the Array: ");
        for(int i = 0; i < size; i++) {
            originalArray[i] = sc.nextInt();
        }
        // reverseInExistingArray(originalArray, size);
        System.out.println(Arrays.toString(reverseUsingNewArray(originalArray, size)));
    }    
}
