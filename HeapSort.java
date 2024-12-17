import java.util.Arrays;

public class HeapSort {

    // Main function that sorts the array using Heap Sort
    public void sort(double[] array) {
        int n = array.length;

        // Step 1: Build a max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // Step 2: Extract elements one by one from the heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root (max element) to the end
            swap(array, 0, i);

            // Call heapify on the reduced heap
            heapify(array, i, 0);
        }
    }

    // Heapify a subtree rooted with node i, n is the size of the heap
    private void heapify(double[] array, int n, int i) {
        int largest = i;  // Initialize largest as root
        int left = 2 * i + 1;  // left child
        int right = 2 * i + 2;  // right child

        // If the left child is larger than root
        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        // If the right child is larger than the largest so far
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        // If the largest is not root, swap and continue heapifying
        if (largest != i) {
            swap(array, i, largest);

            // Recursively heapify the affected subtree
            heapify(array, n, largest);
        }
    }

    // Swap two elements in the array
    private void swap(double[] array, int i, int j) {
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Utility function to print the array
    private void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
