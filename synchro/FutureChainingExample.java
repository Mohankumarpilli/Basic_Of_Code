package synchro;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureChainingExample {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        try {
            Future<String> userIdFuture = executor.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    Thread.sleep(2000); // Simulate delay
                    System.out.println("first");
                    return "User123";   // Return user ID
                }
            });

            // Get the user ID result from the first future
            String userId = userIdFuture.get();

            // Second task: Use the user ID to fetch user details
            Future<String> userDetailsFuture = executor.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    Thread.sleep(200); // Simulate delay
                    System.out.println("second");
                    return "Details of " + userId;  // Use the user ID in this task
                }
            });

            // Get the user details result from the second future
            String userDetails = userDetailsFuture.get();

            System.out.println("User Details: " + userDetails);

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}

