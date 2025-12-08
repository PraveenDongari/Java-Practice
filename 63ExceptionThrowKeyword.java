public class ExceptionThrowKeyword {
    public static void main(String[] args) {
        int i=10;
        int j=0;
        try {
            j=i/j;
            if(j==0)
            {
                throw new Exception("divided by zero");
            }
        }
        catch (Exception e) {
            j=i/1;
            System.out.println("that's the default output");
        
    }

}
