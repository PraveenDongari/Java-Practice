class A
{
    public A()
    {
        //The parent class super() will call the constructor of Object class as every class in java defaultly extends a class "Object"
        //Every class in java extends a class "Object" wheater you mention or not.
        super();//It will be there in a constructor(in first position) even you not mention just like default constructor.
        System.out.println("In A");
    }
    public A(int a)
    {
        super();
        System.out.println("In A Parametarized");
    }
}
class B extends A
{
    public B()
    {
        //  this();//It will call the default constructor of the same class
        super();//It will call the default constructor of a parent class
        System.out.println("In B");
    }
    public B(int b)
    {
        super(b);//It will call the parameterized constructor of a parent class
        System.out.println("In B Parameterarized");
    }
}


public class ThisAndSuperMethod {
    public static void main(String[] args) {
        B obj=new B(5);
        //when a child obj is called it also call's parent obj.
    }
}
