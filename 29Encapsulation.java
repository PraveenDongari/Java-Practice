class Human
{
    //private variables are only accessable in the same class
    //private int age=20;
    //private String Name="Praveen";
    private int age;
    private String Name;

    //getter Method
    public int getAge()
    {
        return age;
    }
    //setter Method
    public void setAge(int a)
    {
        age=a;
    }


    public String getName()
    {
        return Name;
    }
    public void setName(String s)
    {
        Name=s;
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        Human obj=new Human();
        // System.out.println(obj.Name); //does not work due to private variables are only accessable within the same class.
        obj.setAge(20);
        obj.setName("praveen");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
        
    }
}
