 import java.util.Scanner;
 class ReadingInput{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);  
        System.out.println("enter numbers");
        byte b=sc.nextByte();
        short s=sc.nextShort();
        int i=sc.nextInt();
        long l=sc.nextLong();
        char c=sc.next().charAt(0);
        String s1=sc.next();
        sc.nextLine();
        String s2=sc.nextLine();
        System.out.println("Byte : "+b);
        System.out.println("short : "+s);
        System.out.println("int : "+i);
        System.out.println("long :"+l);
        System.out.println("char: "+c);
        System.out.println("string: "+s1);
        System.out.println("collection : "+s2);
    }
 }