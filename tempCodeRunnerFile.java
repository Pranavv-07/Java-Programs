public class stringEx1 {
    public static void main(String args[])
    {
        String str1="Java";
        String str2="Java";
        String str3=new String("Java");
        // == checks adress 
        // equals checks the values.
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));


    }
}
