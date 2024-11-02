package Threads__;

import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<MyCallable> callableTask = () -> {
            Thread.sleep(1000);
            return new MyCallable(5,10);
        };
        //MyCallable callableTask = new MyCallable(5,10);

        Future<Integer> future = executor.submit(callableTask.call());

        Integer result = future.get();

        System.out.println("Result of the computation: " + result);

        executor.shutdown();
    }
}

