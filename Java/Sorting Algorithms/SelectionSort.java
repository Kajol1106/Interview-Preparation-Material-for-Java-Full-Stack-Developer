//SC = O(1) in this code we didn't used extra array to store the result array
//TC = O(n square)
// in all cases TC will be same
//Stable :- no (yahan par index comparison hogi that's why )
//in place algorithm - yes (it's didn't take extra space)

public class SelectionSort {
    public static void selectionSortUsingMinIndex(int n, int[] arr) {
        for(int i=0; i<n-1; i++) {
            //find the minimum element in unsorted part of array
            int minIndex = i;
            for(int j=i+1; j<n; j++) {
                if(arr[minIndex]>arr[j]) {
                    minIndex = j;
                }
            }
            //swap current element and minimum element
            //arr[mindIndex], arr[i]
//            int temp = arr[i];
//            arr[i] = arr[minIndex];
//            arr[minIndex] = temp;
            if(minIndex!=i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }


    public static void selectionSortUsingMaxIndex(int n, int[] arr) {
        for(int i=n-1; i>=0; i--) {
            int maxIndex = i;
            for(int j=i; j>=0; j--) {
                if(arr[maxIndex]<arr[j]) {
                    maxIndex = j;
                }
            }

            //swapping
            if(maxIndex!=i) {
                int temp = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 7, 10, 4, 2, 5};
        int n = arr.length;

        selectionSortUsingMinIndex(n, arr);
        selectionSortUsingMaxIndex(n, arr);
        for(int i: arr) {
            System.out.print(i+" ");
        }
    }
}
