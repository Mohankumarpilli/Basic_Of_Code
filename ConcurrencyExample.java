import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrencyExample {
    public static void main(String[] args) throws InterruptedException {
        SharedCounter sharedCounter = new SharedCounter();
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Submit multiple tasks to the executor
        for (int i = 0; i < 5; i++) {
            executor.execute(new CounterTask(sharedCounter));
        }

        // Shutdown executor service and await termination
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        // Print the final count
        System.out.println("Final count: " + sharedCounter.getCount());

        // Print messages from the queue
        System.out.println("Messages:");
        for (int i = 0; i < 50; i++) {
            try {
                System.out.println(sharedCounter.takeMessage()+" "+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
