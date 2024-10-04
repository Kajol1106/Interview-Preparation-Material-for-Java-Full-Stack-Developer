public class SearchMinInSortedRoatedArray {
    public static void main(String[] args) {
        int[] arr = {5, 6 ,7, 8, 9, 1, 2, 3, 4};
        int n = arr.length;

        System.out.println(searchMin(n, arr));
    }

    public static int searchMin(int n, int[] arr) {
        int start = 0, end = n-1, res = -1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if(arr[mid]<=arr[n-1]) {
                res = mid;
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return res;
    }
}
