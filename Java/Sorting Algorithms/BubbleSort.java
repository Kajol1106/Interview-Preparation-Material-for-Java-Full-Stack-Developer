//TC = O(n square)
//best Case = O(n)
//Average Case = O(n square)
//SC = O(1)

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9, 7, 10, 4, 2, 5};
        int n = arr.length;

        // bubbleSort(n, arr);
        bubbleSort2(n, arr);

        for(int i: arr) {
            System.out.print(i+" ");
        }
    }

    public static void bubbleSort(int n, int[] arr) {
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i-1; j++) {    //last i elements are already sorted so no need to sort them
                if(arr[j]>arr[j+1]) {
                    //swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //how to optimize the bubble sort in the case of nearly sorted arrays
    public static void bubbleSort2(int n, int[] arr) {
        for(int i=0; i<n-1; i++) {
            //we are taking flag for checking swap is happening or not
            //if flag true means swapping is there else not
            //if flag will false we will return and avoid already sorted element comparison repeat
            boolean flag = false;
            for(int j=0; j<n-i-1; j++) {    //last i elements are already sorted so no need to sort them
                if(arr[j]>arr[j+1]) {
                    //swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag) return;
        }
    }
}

/*
Stable Sort & Unstable Sort  : if in array duplicate elements are present then which is in original array first element that will be first
But in unstable sort 2nd duplicate element will be in 1st place of  result array that is called unstable sort
In-place algorithm : means stable or unstable sort will be there
 */