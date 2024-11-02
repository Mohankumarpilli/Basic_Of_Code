package Threads__;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    private int a;
    private int b;

    public MyCallable(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer call() throws Exception {
        // Perform some computation and return a result
//        Thread.sleep(10000);
        int result = a + b;
        return result;
    }
}

