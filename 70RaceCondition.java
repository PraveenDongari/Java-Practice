public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        // when working with threads make sure you do not work with mutables

        Counter counter = new Counter();

        Runnable r = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Runnable r2 = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        System.out.println(counter.count);
        // every time you run this code you will get different output

        // main method will tries to run remaining code while the threads are running

        t1.join();// main method will wait until t1 completed
        t2.join();// main method will wait until t2 completed

        System.out.println(counter.count);

    }
}

class Counter {
    int count = 0;

    // synchronized keyword will make sure that only one thread can access this
    // method at a time
    public synchronized void increment() {
        count++;
    }
}
