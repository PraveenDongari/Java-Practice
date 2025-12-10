public class CustomExceptin {

    public static void main(String[] args) throws MyException {
        int i = 0;
        try {
            int j = 10 / i;
        } catch (ArithmeticException e) {
            throw new MyException("Divided by zero");
        }
    }
}

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}