public class ForLoop {
    public static void main(String[] args) {

        //use it when you know the number of iterations.
        for(int i=0;i<5;i++)
        {
            System.out.println("hi "+i);
        }

        int i=0;
        for(;i<4;)
        {
            System.out.println("hi "+i);
            i++;
        }
    }
}
