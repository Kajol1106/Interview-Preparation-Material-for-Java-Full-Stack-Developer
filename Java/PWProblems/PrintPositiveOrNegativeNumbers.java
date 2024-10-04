package PWProblems;

public class PrintPositiveOrNegativeNumbers {
    public static void main(String[] args) {
        int[] arr = {-1, 45, 6, 7, -23, 90, -56};
        printPositive(arr);
        System.out.println();
        printNegative(arr);
        System.out.println();
    }

    public static void printPositive(int[] arr) {
        for(int i : arr) {
            if(i>=0) {
                System.out.print(i+" ");
            }
        }
    }

    public static void printNegative(int[] arr) {
        for(int i : arr) {
            if(i<0) {
                System.out.print(i+" ");
            }
        }
    }
}
