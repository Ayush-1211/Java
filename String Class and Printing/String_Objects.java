package string.pkgclass.and.printing;
public class String_Objects {
    public static void main(String[] args) {
        String str1 = "Java Program";           // Method 1
        
        String str2 = new String("JAVA");       // Method 2
        
        char c[] = {'H','e','l','l','o'};       
        String str3 = new String(c);
        
        byte b[] = {65,66,67,68};
        String str4 = new String(b);
        String str5 = new String(b,2,2);
        
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
    }
}
