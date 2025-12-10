import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number: ");
        int num = System.in.read();
        System.out.println("You entered: " + num);
        // it will print the ascii value of the number
        System.out.println(num - 48);

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);// bufferreader takes input as string so we need to convert it to
                                                       // integer
        int num1 = Integer.parseInt(reader.readLine());
        System.out.println(num1);

        reader.close();// cloing the resourses

        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        System.out.println(num2);
        sc.close();
    }
}
