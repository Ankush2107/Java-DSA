import java.util.Scanner;

public class frequencyArray {
    public static int[] makeFrequencyArray(int arr[]) {
        int freq[] = new int[100005];
        for(int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq; 
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
        int freq[] = makeFrequencyArray(originalArray);
        System.out.print("Enter the number of queries: ");
        int q = sc.nextInt();
        while(q > 0) {
            System.out.print("Enter the number to be searched: ");
            int x = sc.nextInt();
            if(freq[x] > 0) {
                System.out.println("YES");
            } else {
                System.out.println("No");
            }
            q--;
        }
    }
}
