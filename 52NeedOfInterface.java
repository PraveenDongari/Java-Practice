public class NeedOfInterface {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer des = new Desktop();

        Developer dev = new Developer();
        dev.devApp(lap);
        dev.devApp(des);
    }
}

abstract class Computer// interface Computer
{
    public abstract void code();// void code();
}

class Laptop extends Computer {// implements Computer
    public void code() {
        System.out.println("code,compile,run");
    }
}

class Desktop extends Computer {// implements Computer
    public void code() {
        System.out.println("code,compile,run:Faster");
    }
}

class Developer {
    public void devApp(Computer com) {
        com.code();
    }
}
