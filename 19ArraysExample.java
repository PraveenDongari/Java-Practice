import java.util.Arrays;
public class ArraysExample {
    public static void main(String[] args) {
        //Array: Collection of similar type of elements.
        int[] array={1,2,3,4,5};
        System.out.println(array[0]);//accessing
        array[1]=8;//updating
        System.out.println(array[1]);


        int[] arr=new int[4];//by-default all the values will be zero.
        arr[1]=4;
        arr[2]=8;
        arr[3]=12;
        System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr));
    }
}
