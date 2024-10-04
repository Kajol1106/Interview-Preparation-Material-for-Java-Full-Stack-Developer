public class SortingNamesInArrayByLexicographicallyOrderUsingSelectionSort {
    public static void main(String[] args) {
        String[] names = {"Kajol", "Ram", "Rudra", "Divay", "Vaishnavi", "Vedant"};
        int n = names.length;

        //lexicographical order : dictionary order
        //for number output will be like : 1, 10, 100, 2, 20, 200 like this
        sortNames(names, n);
        for(String val: names) {
            System.out.println(val);
        }

    }

    public static void sortNames(String[] names, int n) {
        for(int i=0; i<n-1; i++) {
            int mindIndex = i;
            for(int j=i+1; j<n; j++) {
                if(names[j].compareTo(names[mindIndex])<0) {
                    mindIndex = j;
                }
            }

            String temp = names[i];
            names[i] = names[mindIndex];
            names[mindIndex] = temp;
        }
    }
}
