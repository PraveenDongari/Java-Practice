public class NewSwitchStatement {
    public static void main(String[] args) {
        String day="saturday";
        switch (day) {
            case "saturday","sunday":
                System.out.println("6Am");
                break;
            case "Monday":
                System.out.println("8AM");
                break;
            default:
                System.out.println("7Am");
        }



        switch (day) {
            case "saturday","Sunday"->System.out.println("6AM");
            case "Monday"-> System.out.println("8Am");
            default->System.out.println("7Am");
        }



        //returning

        String result1="";
        switch (day) {
            case "saturday","sunday" ->result1="6AM";
            case "Monday"->result1="8AM";
            default->result1="7AM";
        }
        System.out.println(result1);




        String result=switch (day) {
            case "saturday","sunday"->"6AM";
            case "Monday"->"7AM";
            default->"6AM";
        };
        System.out.println(result);


        String result2=switch (day) {
            case "saturday","sunday":yield  "6AM";
            case "Monday":yield  "7AM";
            default : yield "6AM";
        };
        System.out.println(result2);
    }
}
