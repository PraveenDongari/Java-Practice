public class Enum {
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal());

        Status[] s1 = Status.values();
        for (Status s2 : s1) {
            System.out.println(s2 + "+" + s2.ordinal());
        }

        Status s2 = Status.Failed;
        if (s2 == Status.Running) {
            System.out.println("All Good");
        } else if (s2 == Status.Waiting) {
            System.out.println("Please Wait");
        } else if (s2 == Status.Failed) {
            System.out.println("Try Again");
        } else if (s2 == Status.Success) {
            System.out.println("Done");
        }

        switch (s2) {
            case Running:
                System.out.println("All Good");
                break;
            case Waiting:
                System.out.println("Please Wait");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Success:
                System.out.println("Done");
                break;
        }

    }
}

enum Status {
    Running, Waiting, Failed, Success;
}
