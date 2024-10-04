public class MoveZerosAtTheEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,3,4,0,9};
        int n = arr.length;

        for(int i=0; i<n; i++) {
            boolean flag = false;
            for(int j=0; j<n-i-1; j++) {
                if(arr[j]==0 && arr[j+1]!=0) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag) return;
        }
        for(int i: arr) {
            System.out.println(i+" ");
        }
    }
}
