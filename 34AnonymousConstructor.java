class A{
    public A()
    {
        System.out.println("Object created in a heap memory");
    }
}

public class AnonymousConstructor {
    public static void main(String[] args) {
        new A();//Anonymous constructor:we can not re-use the same object again
    }
}
