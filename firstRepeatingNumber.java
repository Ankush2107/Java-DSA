public class firstRepeatingNumber {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 4, 6, 3, 4 };
        int ans = 0;
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    ans = arr[i];
                    break;
                }
            }
        } 
        System.out.println(ans);
    }
}
