
import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
       int arr[] = {1, 2, 3, 4, 5};

       int arr_2[] = Arrays.copyOf(arr, arr.length/2);
       for(int n: arr_2) {
        System.out.println(n);
       }
    }
}