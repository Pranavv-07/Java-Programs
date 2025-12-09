import java.util.Arrays;

public class arrayClass {
    public static void main(String[] args) {
        int arr1[]={19,62,2,45,12,4,3,40};
         int arr2[]={19,62,2,45,12,4,3,40};
        for(int a:arr1)
        {
            System.out.print(a+" ");

        }
        System.out.println();

        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        Arrays.fill(arr1,7);
        System.out.println(Arrays.toString(arr1));
        int newArray[]=Arrays.copyOf(arr1, 10);
        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.binarySearch(arr1,2));
        System.out.println(Arrays.equals(arr1,arr2));
    }
    
}
