public class CounterTask implements Runnable {
    private final SharedCounter sharedCounter;

    public CounterTask(SharedCounter sharedCounter) {
        this.sharedCounter = sharedCounter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            sharedCounter.increment();
            try {
                // Simulate some work
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
