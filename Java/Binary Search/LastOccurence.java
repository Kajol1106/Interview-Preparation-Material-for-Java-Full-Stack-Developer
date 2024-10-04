public class LastOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 6};
        int target = 4;
        int n = arr.length;
        System.out.println(lastOccurence(n, arr, target));
    }

    public static int lastOccurence(int n, int[] arr, int target) {
        int start = 0, end = n-1, lastOccurence = -1;
        while (start<=end) {
            //int mid = (start+end)/2;
            //we can calculate mid using above formula also but to avoid overflow we will use below formula
            int mid = start+(end-start)/2;
            if(arr[mid]==target) {
                lastOccurence = mid;
                start = mid+1;
            }
            else if(arr[mid]<target) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return lastOccurence;
    }
}
