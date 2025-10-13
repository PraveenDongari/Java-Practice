class Mobile
{
    String brand;
    int cost;
    static String Name;

    public void show()
    {
        System.out.println(brand+" "+cost+" "+Name);
    }
}

public class StaticVariable {

    //static variable: it is the common variable value which is accessed by every value.(making it as a class member not a object number)
    //just like string constant poll there will  be a place where all the static variables are stored.
    //in non-static methods we can use a static variables.
    public static void main(String[] args) {
        Mobile obj1=new Mobile();
        obj1.brand="apple";
        obj1.cost=1500;
        Mobile.Name="SmartPhone";//obj1.Name="SmartPhone";

        Mobile obj2=new Mobile();
        obj2.brand="samsung";
        obj2.cost=1700;
        Mobile.Name="foldable-phone";//obj2.Name="SmartPhone";


        obj2.show();
        obj1.show();

    }
}
