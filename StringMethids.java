public class StringMethids {
    public static void main(String[] args) {
        String str1="Java Programming";
        String str2="Python Programming";
        String str3="JAVA Programming";
        String str4="python";
        String str5="Java is fun,java is powerul language";
        //length
        System.out.println(str1.length());
        //charAt
        System.out.println(str2.charAt(7));
        //equals
        System.out.println(str1.equals(str3));
        //equalsignorecase
        System.out.println(str1.equalsIgnoreCase(str3));
        //indexof
        System.out.println(str4.indexOf('o'));
        //last index
        System.out.println(str1.lastIndexOf('a'));
        //replace
        System.out.println(str1.replace('a', '@'));
        // replace all
        System.out.println(str1.replaceAll("@","#"));
        //touppercase
        System.out.println(str4.toUpperCase());
        //tolowercase
        System.out.println(str3.toLowerCase());
        //lowercase
        System.out.println(str5.toLowerCase());

    }
    
}
