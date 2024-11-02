package Threads__;

import java.util.Arrays;
import java.util.concurrent.Callable;

class MergeSortTask implements Callable<int[]> {
    private int[] arr;
    private int left, right;

    public MergeSortTask(int[] arr, int left, int right) {
        this.arr = arr;
        this.left = left;
        this.right = right;
    }

    @Override
    public int[] call() throws Exception {
        if (left < right) {
            int mid = (left + right) / 2;

            // Create two Callable tasks for sorting the halves
            MergeSortTask leftTask = new MergeSortTask(arr, left, mid);
            MergeSortTask rightTask = new MergeSortTask(arr, mid + 1, right);

            // Execute tasks using ExecutorService
            int[] leftSorted = leftTask.call();
            int[] rightSorted = rightTask.call();

            // Merge the sorted halves
            merge(leftSorted, rightSorted, left, mid, right);
        }
        return arr;
    }

    private void merge(int[] leftSorted, int[] rightSorted, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        System.arraycopy(arr, left, leftArray, 0, n1);
        System.arraycopy(arr, mid + 1, rightArray, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}

