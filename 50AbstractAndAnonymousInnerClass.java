public class AbstractAndAnonymousInnerClass {
    public static void main(String[] args) {
        // anonymous inner class
        // abstract class can't be instantiated
        A obj = new A() {
            public void show() {
                System.out.println("in anonymous show");
            }

            public void config() {
                System.out.println("in anonymous config");
            }
        };
        obj.show();
        obj.config();
    }
}

abstract class A {
    public abstract void show();

    public abstract void config();
}
