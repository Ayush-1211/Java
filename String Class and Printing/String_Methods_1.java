package string.pkgclass.and.printing;

public class String_Methods_1 {
    public static void main(String[] args) {
        String str = new String("NetBeans");
        String str2 = new String("  Ayush Prajapati    ");
        
        int len = str.length();
        System.out.println(len);  
        System.out.println(str.length());
        
        String low = str.toLowerCase();
        System.out.println(low);
        
        String up = str.toUpperCase();
        System.out.println(up);
        
        String trim = str2.trim();
        System.out.println(trim);
        
        String sub = str.substring(3);
        System.out.println(sub);
        
        String sub2 = str.substring(2, 6);
        System.out.println(sub2);
        
        String rep = str.replace('e', 'k');
        System.out.println(rep);
       
    }
}
