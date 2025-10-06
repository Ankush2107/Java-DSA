public class firstAndSecondMax {
    public static void findFirstAndSecondMax(int arr[], int n) {
        if (n < 2) {
            System.out.println("Array at least contain two elements");
            return;
        }
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] > secondMax && arr[i] != firstMax){
                secondMax = arr[i];
            }
        }
        System.out.println("First Max value: " + firstMax);
        System.out.println("Second Max value: " + secondMax);
    }
    public static void main(String[] args) {
        int nums[] = { 4, 8, 2, 12, 9, 65, 7 };
        findFirstAndSecondMax(nums, nums.length);
    }
}
