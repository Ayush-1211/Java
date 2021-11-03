package string.pkgclass.and.printing;

public class Regular_Expressions_3 {
    public static void main(String[] args) {
        /*
            * = 0 or more time
            + = One or more
            ? = 0 or 1 time
            {X} = X times
            {X,Y} = Between X and Y time
        */
        
        String str1 = "abcdef";
        String str2 = "abc6def";
        String str3 = "aabbccdd";
        String str4 = "";
        String str5 = "acc";
        String str6 = "ac";
        String str7 = "accb";
        String str8 = "ayushprajapati1211@gmail.com";
        String str9 = "ayush-1211@gmail.com";
        
        System.out.println(str1.matches(".*")); 
        System.out.println(str2.matches("[a-z]*")); 
        System.out.println(str3.matches("[a-z]*")); 
        System.out.println(str4.matches("[a-z]*")); 
        System.out.println("-----------------------------");
        
        System.out.println(str4.matches("[a-z]+")); 
        System.out.println("-----------------------------");
        
        System.out.println(str5.matches("[abc]{3}")); 
        System.out.println(str6.matches("[abc]{3}")); 
        System.out.println(str7.matches("[abc]{3}")); 
        System.out.println("-----------------------------");
        
        System.out.println(str7.matches("[abc]{3,7}")); 
        System.out.println("-----------------------------");
        
        System.out.println(str8.matches(".*@gmail.*"));
        System.out.println(str8.matches("\\w*@gmail(.*)")); 
        System.out.println(str9.matches("\\w*@gmail(.*)")); 
    }
}
