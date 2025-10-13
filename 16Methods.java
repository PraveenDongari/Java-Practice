class computer
{
    public void playMusic()
    {
        System.out.println("Playing Music....");
    }
    public String getMePen(int cost)
    {
        if(cost>=10)
        {
            return "Pen";
        }
        return "Nothing";
    }
}


public class Methods {
    public static void main(String[] args) {
        computer obj=new computer();
        obj.playMusic();
        String str=obj.getMePen(2);
        System.out.println(str);
    }
}
