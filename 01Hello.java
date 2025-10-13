// javac-> java compilier(which converts java code to machine readable format which is byte code)
//javac --version
//java->to run the application
//java --version

// java code ---> java compiler(javac)------->java byte code ---->jvm(java virtual machine)
//jre(java runtime environment)=jvm+libraries.



//class name cannot start with numbers.
public class Hello {

    public static void main(String[] args) {
        System.out.println("hello world");

        int num1=5;
        int num2=4;
        int result=num1+num2;
        System.out.println(result);
    }
}