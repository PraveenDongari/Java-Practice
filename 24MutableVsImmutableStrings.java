public class MutableVsImmutableStrings {
    public static void main(String[] args) {
        // String constant poll

        /*
        
        Heap creates an object when the value of the variable does not contains before(for the strings).
        if the value exists before then it only references to the existing object

         */

        String s1="Praveen";
        String s2="Praveen";
        if(s1==s1)
        {
            System.out.println("s1 and s2 reference to the same object");
        }

        /*
        when the object s1 with value is created then it will check in the string constant poii wheather an object with same vaule exist or not.
        if an object with same value exist then it will not create a new object else it only refers to the existing object.
         */



        // when you are changing a string. it means you are not changing the value in the string constant poll.You are creating a new Object with changed value and reference will be changed to the changed value.After some time the previous value is garbage collected.


        //mutable->changable
        //immutable->Not changable

        // there for String are immutable.
    }
}
