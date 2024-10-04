public class FindSquareRoo {
    public static void main(String[] args) {
        int n = 26;

        System.out.println(squareRoot(n));
    }

    public static int squareRoot(int n) {
        int start = 0, end = n, res = -1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            int sqrt = mid*mid;
            if(sqrt==n) {
                return mid;
            }
            if(sqrt>n) {
                end = mid-1;
            }
            else {
                res = mid;
                start = mid+1;
            }
        }
        return res;
    }
}
