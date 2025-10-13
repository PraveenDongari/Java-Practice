class Mobile
{
    String brand;
    int cost;
    static String Name;
    //Shared by all objects of the class.
    //Changing it from one object changes it for all.
    
    
    public Mobile()
    {
        brand="";
        cost=200;
        System.out.println("In constructor");
    }
    public void show()
    {
        System.out.println(brand+" "+cost+" "+Name);
    }

    //This static block is called only once irrespective of number of objects created
    //Runs only once, when the class is loaded into memory (before any objects are created).
    //static block is used to initialize the static variables.
    static
    {
        Name="Smart-Phone";
        System.out.println("In static block");
    }
}

public class StaticBlock {

    //static variable: it is the common variable value which is accessed by every value.(making it as a class member not a object number)
    //just like string constant poll there will  be a place where all the static variables are stored.
    //in non-static methods we can use a static variables.
    public static void main(String[] args) throws ClassNotFoundException {
        
        Mobile obj1=new Mobile();//loads a class and then it will create an object
        obj1.brand="apple";
        obj1.cost=1500;
        Mobile.Name="SmartPhone";//obj1.Name="SmartPhone";

        Mobile obj2=new Mobile();//as the class already loaded it only create an object


        //to load the class without initializing the object
        Class.forName("Mobile");


    }
}
