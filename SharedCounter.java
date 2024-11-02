import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SharedCounter {
    private int count = 0;
    private final Lock lock = new ReentrantLock();
    private final BlockingQueue<String> queue = new LinkedBlockingQueue<>();

    public void increment() {
        lock.lock();
        try {
            count++;
            // Add a message to the queue to simulate communication
            queue.put("Incremented: " + count);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }

    public String takeMessage() throws InterruptedException {
        return queue.take();
    }
}
