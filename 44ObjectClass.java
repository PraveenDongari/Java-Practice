public class ObjectClass {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.brand = "HP";
        l1.price = 30000;

        Laptop l2 = new Laptop();
        l2.brand = "HP";
        l2.price = 30000;

        System.out.println(l1 == l2);
        System.out.println(l1.equals(l2));

        System.out.println(l1);
        // l1=l1.toString();
        // System.out.println(l1.toString());
    }
}

class Laptop {
    String brand;
    int price;

    public boolean equals(Object obj) {
        return this.brand == ((Laptop) obj).brand && this.price == ((Laptop) obj).price;
    }

    public String toString() {
        return "Laptop [brand=" + brand + ", price=" + price + "]";
    }
}