import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        int num = 0;
        BufferedReader br = null;
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(in);

            num = Integer.parseInt(br.readLine());
            System.out.println(num);

        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            // finally block is used to close the resources
            br.close();
            System.out.println("bye");
        }

        // when try with resources is used there is no need to close the resources
        try (BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));) {
            num = Integer.parseInt(br1.readLine());
            System.out.println(num);
        }
    }
}
