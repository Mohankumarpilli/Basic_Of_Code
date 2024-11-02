package Threads__;

import synchro.Counter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Threads2c{
    public static void main(String[] args) throws  Exception {
        counter c1 = new counter();
        ExecutorService e1 =  Executors.newFixedThreadPool(5);
        Future<Void> f = e1.submit(c1);
        f.get();
        System.out.println(c1.getCount());
        e1.shutdown();
    }
}
