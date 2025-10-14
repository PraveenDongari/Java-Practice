class Human{
    private int age;
    private String Name;

    //if instance variable,local variable both have the same name the priority goes to local variable.
    public void setAge(int age,Human obj)
    {
        Human obj1=obj;
        obj.age=age;
    }
    public void SetName(String Name,Human obj)
    {
        Human obj1=obj;
        obj.Name=Name;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return Name;
    }

    //This Keyword refers to the current object

    /*
    
    public void setAge(int age)
    {
        this.age=age;
    }
        public void setName(String Name)
    {
        this.Name=Name;
    }
     */
}


//public class shouls match with the file name
public class ThisKeyword {
    public static void main(String[] args) {
        //every method has it's own stack.
        Human obj=new Human();
        obj.setAge(20,obj);
        obj.SetName("Praveen",obj);
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
