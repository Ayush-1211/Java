package string.pkgclass.and.printing;

public class Regular_Expressions_1 {
    public static void main(String[] args) {
        String str1 = "a";
        String str2 = "8";
        String str3 = "%";
        String str4 = "abc";
        String str5 = "p";
        String str6 = "a7";
        
        System.out.println(str1.matches("."));  // "." means any character
        System.out.println(str2.matches("."));
        System.out.println(str3.matches("."));
        System.out.println(str4.matches("."));
        System.out.println("----------------------");
        
        System.out.println(str1.matches("[abc]"));  // Only for 1 single character 
        System.out.println(str4.matches("[abc]"));
        System.out.println("----------------------");
        
        System.out.println(str5.matches("[^abc]")); 
        System.out.println(str1.matches("[^abc]")); 
        System.out.println("----------------------");
        
        System.out.println(str1.matches("[a-z0-9]"));
        System.out.println(str2.matches("[a-z0-9]"));
        System.out.println(str3.matches("[a-z0-9]"));
        System.out.println("----------------------");
        
        System.out.println(str1.matches("[a-z][0-9]"));
        System.out.println(str6.matches("[a-z][0-9]"));
        System.out.println("----------------------");
        
        System.out.println(str1.matches("a|b"));
        System.out.println(str2.matches("a|b"));
        System.out.println("----------------------");
        
        System.out.println(str1.matches("abc"));
        System.out.println(str4.matches("abc"));
        System.out.println("----------------------");
    }
}
