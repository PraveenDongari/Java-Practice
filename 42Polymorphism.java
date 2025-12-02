class a {
    public void show() {
        System.out.println("a");
    }
}

class b extends a {
    public void show() {
        System.out.println("b");
    }
}

public class Polymorphism {
    // poly=many
    // morph=forms

    /*
     * polymorphism in 2 types
     * 1.compile time polymorphism(method overloading).decides which method to
     * execute at compile time(eg:add(int a,int b ),add(int a,int b,int c) )
     * 2.run time polymorphism(method overriding).decides which method to execute at
     * runtime
     */
    public static void main(String[] args) {
        // dynamic method dispatch:deciding dynamically which method to execute at
        // runtime
        a obj = new a();
        obj.show();

        obj = new b();
        obj.show();
    }
}
