/*
    premitive :
    1->Integer---->byte,short,int,long
    2->Float------>double,float
    3->Charecter--->char
    4->Boolean-->boolean

    int--> 4 byte(32 bits) 1 byte=8 bits
    long-->8 bytes Eg:1234567890l
    short-->2 bytes
    byte-->1 byte


    char-->2 Bytes(enclosed by '')


    by-default point values are treated as double
    double num=5.6;-->8 Bytes
    
    To work with float
    float num1=5.6f;-->4 Bytes
*/
public class DataTypes {
    public static void main(String[] args) {
        byte by=127;
        short s=567;
        int i=123456;
        long l=1234567890l;

        char ch='k';

        boolean boll=true;






        // literals

        int num1=0b101;//binary format
        System.out.println(num1);

        int num2=0x7E;//hexadecimal format
        System.out.println(num2);
    }
}
