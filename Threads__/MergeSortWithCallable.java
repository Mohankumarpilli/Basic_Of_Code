package Threads__;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSortWithCallable {
    public static void main(String[] args) throws Exception {
        int[] arr = {12, 11, 13, 5, 6, 7, 3, 1, 9, 2};

        System.out.println("Original Array: " + Arrays.toString(arr));

        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Create the main task
        MergeSortTask mainTask = new MergeSortTask(arr, 0, arr.length - 1);

        // Submit the task to the executor
        Future<int[]> future = executor.submit(mainTask);

        // Wait for the result
        int[] sortedArray = future.get();

        // Shut down the executor
        executor.shutdown();

        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }
}
