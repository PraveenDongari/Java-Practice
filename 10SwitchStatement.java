public class SwitchStatement {
    public static void main(String[] args) {
        int num=5;
        // if break statement is not mentioned switch statement will run all the cases under the case which satisfies.so to avoid we use break.
        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("enter a valid number");
        }
    }
}
