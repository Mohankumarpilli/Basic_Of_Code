package Threads__;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Client {
    public static void main(String[] args) {
        for(int i=0;i<1000;i++){
            PrintNumberOfTask printNumberOfTask = new PrintNumberOfTask(i);
            Thread t = new Thread(printNumberOfTask);
            t.start();
        }

    }
}
