package Threads__;

public class PrintNumberOfTask implements Runnable{
    private Integer noToprint;

    public PrintNumberOfTask(Integer noToprint) {
        this.noToprint = noToprint;
    }

    @Override
    public void run() {
        System.out.println("number is :"+noToprint+"thread name is : "+Thread.currentThread().getName());
    }
}
