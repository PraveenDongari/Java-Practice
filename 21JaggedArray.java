public class JaggedArray {
    public static void main(String[] args) {
        int[][] arr=new int[3][];

        arr[0]=new int[3];
        arr[1]=new int[4];
        arr[2]=new int[2];

        for(int[] i: arr)
        {
            for(int value:i)
            {
                System.out.print(value+" ");
            }
            System.out.println();
        }

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=(int)(Math.random()*100);
            }
        }

        for(int[] i: arr)
        {
            for(int value:i)
            {
                System.out.print(value+" ");
            }
            System.out.println();
        }



        //3D-Array

        int[][][] array1=new int[3][3][3];
    }
}
