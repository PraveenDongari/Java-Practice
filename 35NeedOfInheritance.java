class Cal{
    public int sum(int i,int j)
    {
        return i+j;
    }
    public int subtraction(int i,int j)
    {
        return i-j;
    }
}


class AdvancedCal extends Cal{//is a relation
    public int multiplication(int i,int j)
    {
        return i*j;
    }
    public int division(int i,int j)
    {
        return i/j;
    }
}

public class NeedOfInheritance {
    public static void main(String[] args) {
        //advancedCal class wants to inherit the all the methods which are in the Cal class.
        AdvancedCal obj=new AdvancedCal();
        System.out.println(obj.sum(1, 2));
        System.out.println(obj.subtraction(2, 6));
        System.out.println(obj.multiplication(2, 3));
        System.out.println(obj.division(2, 4));

    }
}
