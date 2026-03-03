public class InsertionSortExample {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];      // Current element
            int j = i - 1;
