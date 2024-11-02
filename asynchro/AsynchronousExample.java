package asynchro;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AsynchronousExample {

    // Simulate a service A that takes 2 seconds to return data
    public static CompletableFuture<String> fetchDataFromServiceA() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000); // Simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("first");
            return "Data from Service A";
        });
    }

    // Simulate a service B that takes 3 seconds to return data
    public static CompletableFuture<String> fetchDataFromServiceB() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(300); // Simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("second");
            return "Data from Service B";
        });
    }

    public static void main(String[] args) {
        // Start fetching data from both services asynchronously
        CompletableFuture<String> serviceAResult = fetchDataFromServiceA();
        CompletableFuture<String> serviceBResult = fetchDataFromServiceB();

        // Combine the results once both are complete
        CompletableFuture<String> combinedResult = serviceAResult.thenCombine(serviceBResult, (resultA, resultB) -> {
            return resultA + " + " + resultB;
        });

        // Handle the combined result
        combinedResult.thenAccept(finalResult -> {
            System.out.println("Combined Result: " + finalResult);
        });

        // Optionally, wait for the combined result to finish if needed
        try {
            combinedResult.get(); // This blocks the main thread until the combined result is available
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread is free to do other tasks while waiting for the result...");
    }
}