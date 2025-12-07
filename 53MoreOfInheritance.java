public class MoreOfInheritance {

    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        X obj1 = new B();
        obj1.run();

        y obj2 = new B();
        obj2.jump();
    }
}

// class--class-->extends
// interface--interface-->extends
// interface--class-->implements

interface A {
    int age = 10;
    String area = "Hyderabad";

    public void show();

    public void config();
}

interface X {
    void run();
}

interface y extends X {
    void jump();
}

class B implements A, y {
    public void show() {
        System.out.println("show");
    }

    public void config() {
        System.out.println("config");
    }

    public void run() {
        System.out.println("run");
    }

    public void jump() {
        System.out.println("jump");
    }
}