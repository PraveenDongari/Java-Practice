class a{
    public int add(int a,int b)
    {
        return a+b;
    }
}
class b extends a
{
    //method overriding
    public int add(int a,int b)
    {
        return a+b+1;
    }
}

public class MethodOverriding extends Object{
    public static void main(String[] args) {
        b obj=new b();
        System.out.println(obj.add(4,4));
    }
}
