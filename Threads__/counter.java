package Threads__;

import java.util.concurrent.Callable;

public class counter implements Callable<Void> {
    int count =0;
    public Void call(){
        count++;
        return null;
    }
    public int getCount(){
        return count;
    }
}
