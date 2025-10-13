class Calculate{
    int num=10;//global variable
    public int add(int n1,int n2)
    {
        //n1,n2 are local variables
        System.out.println(num);
        return n1+n2;
    }
}

public class StackAndHeap {

// Every method has it's own stack in the jvm to store the values.(name of the variable,value)
//Local variables are the part of stack
//Heap : it contains global variables,methods
//when object is created stack stores the address of the heap

    public static void main(String[] args) {
        Calculate obj=new Calculate();//different objects are created in heap.
        Calculate obj1=new Calculate();

        int result2=obj1.add(5, 6);
        int result=obj.add(4,5);
        System.out.println(result);
        System.out.println(result2);

        obj.num=12;
        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
}
