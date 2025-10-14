class Human{
    int Age;
    String Name;
    public Human(){
        Age=20;
        Name="Praveen";
    }
}

public class Constructor {
    public static void main(String[] args) {
        //Constructor is a method it has the same name as the class name.
        //when an object is created the constructor is called
        //every time you create a new object constructor is called every time.

        Human obj=new Human();
        System.out.println(obj.Age);
    }
}
