class claculate
{
    public int sum(int n1,int n2)
    {
        int r=n1+n2;
        return r;
    }
}


public class Objects {
    public static void main(String[] args) {
        //Object Oriented Programming
        //Objects :properties and Behaviour

        // to create an object first we need to create a class
        //jvm creates the objects

        claculate cal=new claculate();//object creation
        int num1=5;
        int num2=4;
        int result=cal.sum(num1,num2);
        System.out.println(result);


        /*
        
        JDK(java development kit):compile the code with the help of jdk
        JVM(java virtual machine):machine which runs the code
        JRE(java runtime environment):it contains jvm and some libraries that we used in the program.

         */
    }
}
