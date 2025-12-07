//enum is a class
//you cannot extend enum with any other class
//enum extends enum class by default

enum Laptop {
    Macbook(2000), XPS(2200), Surface, Yhinkpad(1800);

    private int price;

    private Laptop() {
        price = 500;
        System.out.println("in laptop" + this.name() + "price:" + this.price);
    }

    private Laptop(int price) {
        this.price = price;
        System.out.println("in laptop" + this.name() + "price:" + this.price);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class EnumClass {
    public static void main(String[] args) {
        Laptop obj = Laptop.Macbook;
        System.out.println(obj + ":" + obj.getPrice());

        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + ":" + lap.getPrice());
        }
    }
}
