package PWProblems;

public class PrintOddEvenValues {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 3, 5};
        printOdd(arr);
        System.out.println();
        printEven(arr);
    }

    public static void printOdd(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%2==1) {
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void printEven(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%2==0) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
