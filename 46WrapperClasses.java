public class WrapperClasses {
    public static void main(String[] args) {
        /*
         * int-->Integer
         * double-->Double
         * char-->Character
         * boolean-->Boolean
         */

        // boxing
        int i = 10;
        Integer i2 = new Integer(i); // Integer i2 =i;(auto-boxing)

        // unboxing
        int i3 = i2.intValue();// int i3=i2;(auto-unboxing)
        System.out.println(i3);

    }
}
