public class ConditionalStatements {
    public static void main(String[] args) {
        // if there is a single statement in a if/else condition it is not nessary to have {};
        int num=28;
        if(num>=10 && num<=20)
        {
            System.out.println("hello");
        }
        else{
            System.out.println("bye");
        }


        if(true)
        {
            System.out.println("hey");
        }


        int x=5;
        int y=7;
        if(x>y)
        {
            System.out.println(x);
        }
        else{
            System.out.println(y);
        }
    }
}
