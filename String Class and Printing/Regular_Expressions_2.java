package string.pkgclass.and.printing;

public class Regular_Expressions_2 {
    public static void main(String[] args) {
        /*
                \d = Digits
                \D = Not Digits
                \s = Space
                \S = Not Space
                \w = Alphabets or Digits
                \W = Neither alphabet ot digit
        */
        
        String str1 = "a";
        String str2 = "8";
        String str3 = "$";
        String str4 = " ";
        
        System.out.println(str1.matches("\\w"));
        System.out.println(str2.matches("\\w")); 
        System.out.println("----------------------");
        
        System.out.println(str1.matches("\\d"));
        System.out.println(str2.matches("\\d"));
        System.out.println(str1.matches("\\D"));
        System.out.println(str3.matches("\\D"));
        System.out.println("----------------------");
        
        System.out.println(str3.matches("\\W"));
        System.out.println("----------------------");
        
        System.out.println(str4.matches("\\s"));
        System.out.println(str4.matches("\\S"));
    }
}
