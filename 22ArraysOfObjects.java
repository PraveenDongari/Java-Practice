class Student
{
    int roll_No;
    String Name;
    int Marks;
}

public class ArraysOfObjects {
    public static void main(String[] args) {

        Student s1=new Student();
        s1.roll_No=1;
        s1.Name="Praveen";
        s1.Marks=80;

        Student s2=new Student();
        s2.roll_No=2;
        s2.Name="Palthu";
        s2.Marks=60;

        Student s3=new Student();
        s3.roll_No=3;
        s3.Name="mushu";
        s3.Marks=90;


        Student[] s=new Student[3];
        s[0]=s1;
        s[1]=s2;
        s[2]=s3;

        //normal for loop
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i].Name +" "+s[i].Marks);
        }

        //enhanced for loop

        for(Student stu:s)
        {
            System.out.println(stu.Name+" "+stu.Marks);
        }
    }
}
