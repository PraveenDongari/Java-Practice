/*
types of interfaces :
1)normal: 2 or more abstract methods
2)functional / single abstract method : only one abstract method
3)marker : no abstract methods


//serialization : copying the state of the object to the file
//de-serialization : restoring the state of the object to the memory

*/

@FunctionalInterface
interface a {

    void show();
}
// class b implements a{
// public void show(){
// System.out.println("Implementation of myMethod");
// }
// }

public class TypesOfInterfaces {
    public static void main(String[] args) {
        a obj = new a() {
            public void show() {
                System.out.println("Implementation of myMethod");
            }
        };
        obj.show();
    }
}
