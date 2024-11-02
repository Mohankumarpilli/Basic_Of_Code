import  java.util.concurrent.*;
public class Foo {
    Semaphore s1 = new Semaphore(1);

    public Foo() {
    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        s1.acquire();
        printFirst.run();
        s1.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        // printSecond.run() outputs "second". Do not change or remove this line.
        s1.acquire();
        printSecond.run();
        s1.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        // printThird.run() outputs "third". Do not change or remove this line.
        s1.acquire();
        printThird.run();
        s1.release();
    }
}
