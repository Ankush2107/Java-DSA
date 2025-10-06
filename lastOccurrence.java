public class lastOccurrence {
    public static void main(String[] args) {
        int arr[] = { 5, 8, 7, 6, 5, 9, 1, 5 };
        int x = 5;
        int lastIndex = -1;
        
        for(int i = 0; i < arr.length; i++ ) {
            if(arr[i] == x) {
                lastIndex = i;
            }
        }
        System.out.println(lastIndex);
    }
}
