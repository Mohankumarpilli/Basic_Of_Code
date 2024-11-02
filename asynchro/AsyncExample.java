package asynchro;

import java.util.concurrent.*;

public class AsyncExample {
    public static void main(String[] args) {
        // Start an asynchronous task
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            // Simulate a long-running task
            try {
                Thread.sleep(2000); // 2 seconds delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello from the async task!";
        });

        // Do other tasks while the async task is running
        System.out.println("Doing other work...");

        // Wait for the async task to complete and get the result
        try {
            String result = future.get(); // This blocks until the async task completes
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<String> future1 = executor.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                // Simulate a long-running task
                Thread.sleep(2000); // 2 seconds delay
                return "Hello from the async task using Future!";
            }
        });

        System.out.println("Doing other work...");

        try {
            String result = future1.get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }

    }
}
