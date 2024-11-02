package synchro;

public class Counter {
    int count;
    public synchronized void increment(){
        count++;
    }
}
