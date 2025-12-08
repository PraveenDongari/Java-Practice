public class Annotation {
    public static void main(String[] args) {
        b obj = new b();
        obj.show();
    }
}

class a {
    public void show() {
        System.out.println("in a show");
    }
}

class b extends a {

    @Override
    public void show() {
        System.out.println("in b show");
    }
}