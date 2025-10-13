class calculate{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public int add(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }
    public double add(double n1,int n2)
    {
        return n1+n2;
    }

    //methods can have different number of parameters or with same number of parameters  but different type of parameters.
    //method over loading depends only on method name and parameters does not depend on return type.
}


public class MethodOverloading {
    public static void main(String[] args) {
        calculate obj=new calculate();
        int result1=obj.add(4,5);
        int result2=obj.add(5,6,7);
        System.out.println(result1);
        System.out.println(result2);
        double result3=obj.add(12.5,5);
        System.out.println(result3);
    }
}
