import java.util.Scanner;

public class arrays_ex3{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int [row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        for(int a[]:arr)
        {
            for(int n:a)
            {
                System.out.print(n+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
