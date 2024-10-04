package PWProblems;

public class MaxMinValueInArray {
    public static void main(String[] args) {
        int[] arr = {4, 7, -2, 87, 12, 90, 1};
        maxValue(arr);
        minValue(arr);
    }

    public static void maxValue(int[] arr) {
        int max = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public static void minValue(int[] arr) {
        int min = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
