package PWProblems;

public class SearchValueInArray {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 87, 12, 90, 1};
        int target = 87;
        System.out.println(isPresent(arr, target));


        int res = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==target) {
                res = i;
                break;
            }
        }

        if(res == -1) {
            System.out.println("element not found");
        }
        else {
            System.out.println(res);
        }
    }

    public static int isPresent(int[] arr, int target) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==target) {
                return i;
            }
        }
        return -1;
    }
}
