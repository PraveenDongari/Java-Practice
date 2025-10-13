public class StringBufferAndStringBuilder {
    public static void main(String[] args) {
        
        //StringBuffer(it is thread safe) and StringBuilder(it is not thread safe) are mutable.

        StringBuffer sb1=new StringBuffer("Praveen");
        sb1.append("Varma");//appending new string
        System.out.println(sb1);

        sb1.deleteCharAt(2);//deleting a charecter
        System.out.println(sb1);

        sb1.delete(1, 4);//deleting a sub string
        System.out.println(sb1);

        sb1.insert(0, "java");//inserting a string in a index
        System.out.println(sb1);
    }
}
