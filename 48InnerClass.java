class A {
    int age;

    public void show() {
        System.out.println("show");
    }

    // static keyword can be used to create inner class
    class B {
        public void config() {
            System.out.println("config");
        }
    }
}

public class InnerClass {

    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.config();
    }
}
