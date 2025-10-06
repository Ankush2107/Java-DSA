public class countOccurrence {
    public static void main(String[] args) {
        int arr[] = { 5, 8, 7, 6, 5, 9, 1, 5 };
        int x = 5;
        int count = 0;
        for(int num: arr) {
            if(num == x) {
                count++;
            }
        }
        System.out.println(count);
    }
}