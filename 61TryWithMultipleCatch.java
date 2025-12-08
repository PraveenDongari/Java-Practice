public class TryWithMultipleCatch {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            System.out.println(arr[10]);
        }

        // specific exceptions followed by general exception
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception " + e);

        } catch (ArithmeticException e) {
            System.out.println("Exception " + e);
        } catch (Exception e) {
            System.out.println("Exception " + e);
        }
    }
}
