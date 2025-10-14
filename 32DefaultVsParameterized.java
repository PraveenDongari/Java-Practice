class Human{
    private int Age;
    private String Name;

    //if you are not created the default constructor jvm will authomatically creates and assign the default values.
    //default constructor
    public Human(){
        Age=20;
        Name="Praveen";
    }

    //parameterized constructor
    public Human(int a,String N)
    {
        Age=a;
        Name=N;
    }

    /*
    
    public Human(int Age,String Name)
    {
        this.Age=Age;
        this.Name=Name;
    }
     */
}

public class DefaultVsParameterized {
    public static void main(String[] args) {
        
    }
}
