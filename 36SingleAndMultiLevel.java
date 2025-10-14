class Cal{
    public int add(int i,int j)
    {
        return i+j;
    }
    public int subtract(int i,int j)
    {
        return i-j;
    }
}
class AdvCal extends Cal
{
    public int multiplication(int i,int j)
    {
        return i*j;
    }
    public int division(int i,int j)
    {
        return i/j;
    }
}
class VeryAdvcal extends AdvCal{
    public double pow(int i,int j)
    {
        return Math.pow(i,j);
    }
    public int remainder(int i,int j)
    {
        return i%j;
    }
}
public class SingleAndMultiLevel {
    public static void main(String[] args) {
        //cal<--advcal(single level inheritance)
        //cal<--advcal<--veryAdvcal(multi-level inheritence)
        VeryAdvcal obj=new VeryAdvcal();
        System.out.println(obj.add(1, 2));
        System.out.println(obj.multiplication(2, 4));
        System.out.println(obj.pow(2, 4));
    }
}
