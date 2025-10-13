public class MultiDimentionalArray {
    public static void main(String[] args) {
        int[][] arr=new int[2][3];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=(int)(Math.random()*100);
            }
        }

        //printing using for loop
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //printing using foreach loop

        for(int[] a:arr)
        {
            for(int val:a)
            {
                System.out.print(val+" ");
            }
            System.out.println();
        }

    }
}
