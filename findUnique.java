public class findUnique {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 2, 1, 3 };
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        for(int num: arr) {
            if(num > 0) {
                System.out.println(num);
            }
        }
    }
}
