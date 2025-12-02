import packagesexample.AdvanCal;
import packagesexample.Calc;

public class Packages {
    public static void main(String[] args) {
        Calc calc = new Calc();
        AdvanCal advanCal = new AdvanCal();
        System.out.println(calc.add(10, 20));
        System.out.println(advanCal.multiplication(10, 20));
    }
}
