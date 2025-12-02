class a {
    public void show1() {
        System.out.println("a");
    }
}

class b extends a {
    public void show2() {
        System.out.println("b");
    }
}

public class UpcastingAndDowncasting {
    public static void main(String[] args) {
        double d = 4.5;
        int i = (int) d;
        System.out.println(i);

        a obj = new a();
        obj.show1();

        obj = (a) new b();// upcasting
        obj.show1();

        b obj2 = (b) obj;// downcasting
        obj2.show2();
    }
}
