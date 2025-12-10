public class ThreadsInJava {
    public static void main(String[] args) {
        // threads are used to perform multiple tasks at the same time
        // dividing the work into multiple threads

        A a = new A();
        B b = new B();

        a.run();// executes sequentially
        b.run();

        a.start();// executes parallelly
        b.start();// it will execute the run method

        // octa-core will process 8 threads at a time

        // scheduler will schedule the threads

        // the range of the priority is 1 to 10
        // 1 is the lowest priority
        // 10 is the highest priority
        // by default the priority is 5

        System.out.println(a.getPriority());
        System.out.println(b.getPriority());

        a.setPriority(10);
        b.setPriority(1);

        System.out.println(a.getPriority());
        System.out.println(b.getPriority());
    }
}

class A extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
