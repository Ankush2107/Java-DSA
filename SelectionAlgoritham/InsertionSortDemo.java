

public class InsertionSortDemo {
    static void insertionSort(int[] arr){
        int n=arr.length;
        for (int i = 1; i < n; i++) {
          int j=i;
          while(j>0 && arr[j]<arr[j-1]){
            // swap
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;
          }

        }
    }
    static  void printArray(int[] arr){
        for(int i:arr){
            System.out.println(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={4,5,1,3,6};
        System.out.print("Array before insertion Sort");
        System.out.println();// line break
        printArray(arr);
        insertionSort(arr);
         System.out.println("Array after insertion Sort");
         printArray(arr);

        
    }
    
}
