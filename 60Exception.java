/*
Exception:

Errors:
1)compile time error
2)runtime error
3)Logical error

*/

public class Exception {
    public static void main(String[] args) {
        int i = 0;
        try {
            int j = 18 / i;
        } catch (ArithmeticException e) {
            System.out.println("Exception " + e);
        }
    }
}
