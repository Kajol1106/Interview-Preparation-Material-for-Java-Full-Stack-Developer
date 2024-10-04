public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 1;
        System.out.println(binarySearch(arr, target));

        //checking from 5 to 10 element present or not in array
        int t = 5;
        while(t != 10) {
            System.out.printf("%d are present in arr : %b \n", t, binarySearch(arr, t));
            t++;
        }

        int start = 0, end = arr.length-1;
        System.out.println(recursiveAppraoch(arr, target, start, end));
    }

    public static boolean binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length-1;
        while(start <= end) {
            int mid = (start+end)/2;
            if(arr[mid]==target) {
                return true;
            }
            else if(arr[mid]<target) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return false;
    }

    public static boolean recursiveAppraoch(int[] arr, int target, int start, int end) {
        if(start>end) return false;     //base condition

        int mid = (start+end)/2;
        if(arr[mid]==target)  {
            return true;
        }
        else if(arr[mid]<target) {
            return recursiveAppraoch(arr, target, mid+1, end);
        }
        else {
            return recursiveAppraoch(arr, target, start, mid-1);
        }
    }
}
