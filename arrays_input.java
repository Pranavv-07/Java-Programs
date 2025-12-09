import java.util.Scanner;
class arrays_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char c[]=new char[n];
        for(int i=0;i<c.length;i++)
        {
            c[i]=sc.next().charAt(0);
        }
        for(char a:c)
        {
            System.out.println(a);
        }

        sc.close();
    }
}
