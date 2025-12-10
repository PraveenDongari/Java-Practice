public class RunnableVsThread {
    public static void main(String[] args) {
        // if a class want to extend another class then it can't extend thread class
        // so we use runnable interface

        A a = new A();
        B b = new B();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();

        /*
         * Runnable r = ()-> {
         * for (int i = 0; i < 5; i++) {
         * System.out.println("hello");
         * try {
         * Thread.sleep(10);
         * } catch (InterruptedException e) {
         * e.printStackTrace();
         * }
         * }
         * 
         * Runnable r2 = ()->{
         * for (int i = 0; i < 5; i++) {
         * System.out.println("hello");
         * try {
         * Thread.sleep(10);
         * } catch (InterruptedException e) {
         * e.printStackTrace();
         * }
         * }
         * };
         * 
         */

    };
}

class A implements Runnable {

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

class B implements Runnable {
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
