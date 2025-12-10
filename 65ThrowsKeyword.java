public class ThrowsKeyword {
    public static void main(String[] args) {
        a obj = new a();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class a {
    static {
        System.out.println("static block loaded");
    }

    public void show() throws ClassNotFoundException {
        Class.forName("Demo");
    }
}
