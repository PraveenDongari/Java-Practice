public class IfElseIf {
    public static void main(String[] args) {

        // else condition is optional
        int x=7;
        int y=8;
        int z=10;

        if(x>y && x>z)
        {
            System.out.println(x);
        }
        else if(y>z && y>x)
        {
            System.out.println(y);
        }
        else
        {
            System.out.println(z);
        }
    }
}
