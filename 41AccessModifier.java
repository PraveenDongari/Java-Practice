import AccessModifiersexample.Prot;
import AccessModifiersexample.Pub;

public class AccessModifier {
    /*
     * public:it can be accessed by any class with in the same package or different
     * package(public class,public method,public variable)
     * private:it can be accessed by only within the class(private class,private
     * method,private variable)
     * default:it can be accessed by only within the package(default class,default
     * method,default variable)
     * protected:it can be accessed by only within the package and different
     * package(protected class,protected method,protected variable)
     */
    public static void main(String[] args) {
        Pub obj1 = new Pub();
        obj1.publicmethod();
        // Def obj2 = new Def();
        // obj2.defaultMethod();//default method is cannot be accessed by different
        // package(same package)
        // Prot obj3 = new Prot();
        // obj3.protectedMethod();//protected method is cannot be accessed by different
        // package(same package and different package with subclass)
        // Private obj4 = new Private();
        // obj4.privateMethod();//private method is cannot be accessed by different
        // package(same class)

    }

    class def extends Prot { // accessing the protected methods,varibles fro different pakage but sub class.
        public void callprotectedMethod() {
            System.out.println(protectedvariable);
            protectedMethod();
        }

    }
}
