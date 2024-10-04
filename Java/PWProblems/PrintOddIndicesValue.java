package PWProblems;

public class PrintOddIndicesValue {
    public static void main(String[] args) {
        String[] arr =  {"ab", "bc", "cd", "de", "ef", "fg", "gh"};
        printOddIndicesValue(arr);
        System.out.println();
        printEvenIndicesValue(arr);
    }

    public static void printOddIndicesValue(String[] arr) {
        for(int i=0; i<arr.length; i++) {
            if(i%2==1) {
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void printEvenIndicesValue(String[] arr) {
        for(int i=0; i<arr.length; i++) {
            if(i%2==0) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
