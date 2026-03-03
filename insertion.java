public class InsertionSortExample {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];      // Current element
            int j = i - 1;
while (j >= 0 && arr[j] > key) {
arr[j + 1] = arr[j];
j--;
}

arr[j + 1] = key; // Place key in correct position
}
}
public static void main(String[] args) {
int[] arr = {5, 2, 9, 1, 5, 6};

insertionSort(arr);

System.out.println("Sorted array:");
for (int num : arr) {
System.out.print(num + " ");
}
}
}
