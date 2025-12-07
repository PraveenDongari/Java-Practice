//interface classes : if a class has only abstract methods then it is interface class
//every method in interface is public abstract by default
//every variable in interface is public static final by default

public class Interface {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();

        System.out.println(A.age);
        System.out.println(A.name);
    }
}

// interfaces dont have own memory in heap
interface A {
    int age = 10;
    String name = "Telusuko";

    void show();

    void config();
}

class B implements A {// B is a child of A.in which it only have the class not the variables of the
                      // class A.
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }
}
