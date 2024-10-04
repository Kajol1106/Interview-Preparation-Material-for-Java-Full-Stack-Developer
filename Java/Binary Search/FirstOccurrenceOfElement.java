public class FirstOccurrenceOfElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 6};
        int target = 4;
        int n = arr.length;
        System.out.println(fistOccurence(n, arr, target));
    }

    public static int fistOccurence(int n, int[] arr, int target) {
        int start = 0, end = n-1, firstOccurence = -1;
        while (start<=end) {
            //int mid = (start+end)/2;
            //we can calculate mid using above formula also but to avoid overflow we will use below formula
            int mid = start+(end-start)/2;
            if(arr[mid]==target) {
                firstOccurence = mid;
                end = mid-1;
            }
            else if(arr[mid]<target) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return firstOccurence;
    }

    //using linear search
//    public static int fistOccurence(int n, int[] arr, int target) {
//        for(int i=0; i<n; i++) {
//            if(arr[i]==target) {
//                return i;
//            }
//        }
//        return -1;
//    }
}
