import java.util.*;
public class quicksort {

   
    static int partition(int[] ar, int low, int high) {
        int pivot = ar[high]; // Choosing the last element as the pivot
        int i = low - 1; // Index of the smaller element

        for (int j = low; j < high; j++) {
           
            if (ar[j] <= pivot) {
                i++;
                // Swap ar[i] and ar[j]
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }

        // Swap the pivot element with the element at index i+1
        int temp = ar[i + 1];
        ar[i + 1] = ar[high];
        ar[high] = temp;

        return i + 1; // Return the index of the pivot
    }

    static void quickSort(int[] ar, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pi = partition(ar, low, high);

            // Recursively sort the sub-arrays
            quickSort(ar, low, pi - 1);  // Sort elements before the pivot
            quickSort(ar, pi + 1, high); // Sort elements after the pivot
        }
    }

    public static void main(String[] args) {
        int[] ar = {10, 7, 8, 9, 1, 5};
        int n = ar.length;

        // Perform QuickSort on the array
        quickSort(ar, 0, n - 1);

        // Print the sorted array
        System.out.println(Arrays.toString(ar));
    }
}
