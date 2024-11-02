package synchro;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class syncdemo {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter();
        c.increment();
        c.increment();
        System.out.println(c.count);

//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i=0;i<1000;i++){
//                    c.increment();
//                }
//            }
//        });
//        t1.start();
//        t1.join();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    c.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    c.increment();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        //Counter c = new Counter();

        // Create an ExecutorService with a single thread in the pool
//        ExecutorService executor = Executors.newSingleThreadExecutor();
//
//        // Submit the Runnable task to the executor
//        executor.submit(() -> {
//            for (int i = 0; i < 1000; i++) {
//                c.increment();
//            }
//        });
//
//        // Submit another task to increment in parallel
//        executor.submit(() -> {
//            for (int i = 0; i < 1000; i++) {
//                c.increment();
//            }
//        });
//
//        // Shut down the executor after the tasks are submitted
//        executor.shutdown();
//
//        // Wait for all tasks to complete, or timeout after 1 minute
//        if (executor.awaitTermination(1, TimeUnit.MINUTES)) {
//            // All tasks have completed within the timeout period
//            System.out.println("Final count: " + c.count);
//        } else {
//            // The timeout elapsed before all tasks could complete
//            System.out.println("Some tasks were not completed within the timeout.");
//        }
//        System.out.println(c.count);
    }
}
