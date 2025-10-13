public class TypeConversionAndCasting {
    
    //convertion:automatic
    /*Eg:
        byte b=127;
        System.out.println(b);

        int a=b;//assigning byte value to int variable.
        System.out.println(a);
     */

    //casting:manual
    /*
     * Eg :
        float f=5.7f;
        int i=(int)f;
        System.out.println(i);
    */
    
    public static void main(String[] args) {
        //float to int
        float f=5.7f;
        int i=(int)f;
        System.out.println(i);

        //byte to int
        byte b=127;
        System.out.println(b);

        int a=b;//assigning byte value to int variable.
        System.out.println(a);


        // int to byte
        int num=2;
        //byte num2=num; // incompatible(Error)
        //System.out.println(num2);

        byte num3=(byte)num;// If number excedds the range then it wraps around(number%range)
        System.out.println(num3);


        //float to int
        float f1=5.6f;
        int t=(int)f;
        System.out.println(t);



        //Type Promotion
        byte x1=10;
        byte x2=30;
        int result=x1*x2;
        System.out.println(result);
    }
}
