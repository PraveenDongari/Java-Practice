public class LogicalOperator {
    public static void main(String[] args) {
        /*
            &&-AND
            ||-OR
            !-NOT
         */

         // short-circuit : in OR operation if first statement is true then it does not even check the second relational statement it will print true(independent of 2nd statement) vice-versa.

        int a=5;
        int b=6;
        int x=7;
        int y=9;

        boolean result1=a>b && x>y;
        boolean result2=a>b || x>y;
        boolean result3=!(a>b || x>y);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
