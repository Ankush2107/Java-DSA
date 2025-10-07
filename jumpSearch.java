public class jumpSearch {
    public static int jumpSearchProblem(int[] arr, int target) {
        int n = arr.length;
        int blockSize = (int)Math.sqrt(n);
        int startIndex = 0;
        int endIndex = blockSize;
        while (endIndex < n && arr[endIndex] <= target) {
            startIndex = endIndex;
            endIndex += blockSize;
            if(endIndex > n) {
                endIndex = n;
            }
        }
        int result = -1;
        for(int i = startIndex; i < endIndex; i++) {
            if(arr[i] == target) result = i;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 5, 7, 9, 12, 25, 46, 99, 101 };
        int target = 25;
        int ans = jumpSearchProblem(arr, target);
        System.out.println(ans);
    }
}
