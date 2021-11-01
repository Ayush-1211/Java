package string.pkgclass.and.printing;

public class String_Methods_2 {
    public static void main(String[] args) {
        String str1 = "Mr. Ayush Prajapati";
        String str2 = "www.udemy.co.in";
        
        System.out.println(str1.startsWith("Mr."));
        System.out.println(str1.startsWith("mr."));
        System.out.println(str1.startsWith("Ayu", 4));
        
        System.out.println(str1.endsWith("Prajapati"));
        System.out.println(str1.endsWith("prajapati"));
        
        System.out.println(str1.charAt(4));
        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i));
        }
        System.out.println();
        
        System.out.println(str2.indexOf("."));
        System.out.println(str2.indexOf("udemy"));
        System.out.println(str2.indexOf(".",4));
        System.out.println(str2.lastIndexOf("."));
        System.out.println(str2.lastIndexOf(".",6));
    }
}
