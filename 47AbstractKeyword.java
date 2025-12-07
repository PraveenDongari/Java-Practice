public class AbstractKeyword {
    public static void main(String[] args) {
        updatedWagnR obj = new updatedWagnR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
// abstract keyword is used to declare a method.
// abstract method is a method that does not have a body.
// abstract class can have both abstract and non-abstract methods.

// abstract methods only exists in abstract class.
// you cant create object of abstract class.

abstract class car {

    public abstract void drive();// method declaration

    public abstract void fly();

    public void playMusic() {
        System.out.println("play music");
    }
}

class WagnR extends car {

    public void drive()// method implementation
    {
        System.out.println("Driving");
    }

    public void fly() {
        System.out.println("Flying");
    }
}

class updatedWagnR extends WagnR { // concrete class.we can create the object of concrete class.it is a class where
                                   // all the declared methods are implemented.
    public void fly() {
        System.out.println("Flying");
    }
}
