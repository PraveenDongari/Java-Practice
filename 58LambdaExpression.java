@FunctionalInterface
interface a {

    void show(int i);
}

// Lambda Expression only works with functional interface

// class b implements a{
// public void show(){
// System.out.println("Implementation of myMethod");
// }
// }

// if a block contains only single line then there is no need to use {}
public class LambdaExpression {
    public static void main(String[] args) {
        a obj = (int i) -> {

            System.out.println(i);
        };
        obj.show(10);
    }
}
