public class isSorted {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 }; 
        boolean check = true;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]) {
                check = false;
                break;
            }
        }
        if(check) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not  sorted");
        }
    }
}
