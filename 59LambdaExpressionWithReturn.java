@FunctionalInterface
interface a {
    int add(int a, int b);
}

public class LambdaExpressionWithReturn {
    public static void main(String[] args) {
        a obj = (int a, int b) -> {
            return a + b;
            /*
             * a obj=(a, b)->a+b;
             */
        };
        System.out.println(obj.add(10, 20));
    }
}
