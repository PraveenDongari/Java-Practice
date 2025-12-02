public class finalkeyword {
    // final : class,variable,method
    public static void main(String[] args) {

        final int a = 10;
        // a=20; //final variable cannot be changed
        System.out.println(a);

    }

}

// final class cannot be inherited
// final method cannot be overridden
class calc {

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void show() {
        System.out.println("in calc show");
    }
}

class Advancedcalc extends calc {

}
