public class SearchTargetInSortedRoatatedArrays {
    public static void main(String[] args) {
        int[] arr = {5, 6 ,7, 8, 9, 10, 1, 2, 3, 4};
        int n = arr.length;
        int target = 10;

        System.out.println(searchTarget(n, arr, target));
    }

    public static int searchTarget(int n, int[] arr, int target) {
        int start = 0, end = n-1;
        while(start<=end) {
            int mid = start+(end-start)/2;
            if(arr[mid]==target) {
                return mid;
            }

            //mid to end is sorted
            else if(arr[mid]<arr[end]) {
                if(target>arr[mid] && target<=arr[end]) {
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }

            //start to mid is sorted
            else {
                if(target>=arr[start] && target<arr[mid]) {
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
        }

        return -1;
    }
}
