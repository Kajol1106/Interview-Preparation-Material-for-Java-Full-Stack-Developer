//tc = O(n)
// worst and average case = O(n square)
//sc = o(1)
//stable = yes


public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9, 7, 10, 4, 2, 5};
        int n = arr.length;

        insertionSort(n, arr);
        //insertionSort2(n, arr);

        for(int i: arr) {
            System.out.print(i+" ");
        }
    }

    public static void insertionSort(int n, int[] arr) {
        //we will think first element is allready in sorted order. Then we will compare previous element with next element and swap
            for(int i=1; i<n; i++) {
                int j = i;
                while(j>0 && arr[j]<arr[j-1]) {
                    //do swapping arr[j], arr[j-1]
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--;
                }
            }
    }
}
