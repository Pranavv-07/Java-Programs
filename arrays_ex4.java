import java.util.Arrays;
public class arrays_ex4 {
    public static void main(String args[])
    {
        int arr1[][]={{1,2,3},{2,3,4}};
        int arr2[][]={{1,2,3},{2,3,4}};
        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepEquals(arr1,arr2));
    }
}
