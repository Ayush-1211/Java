package string.pkgclass.and.printing;

public class RE_Example_1 {
    public static void main(String[] args) {
        // Find if a number is Binary or not
        int b = 1000110;
        int c = 1800110;
        
        String str = String.valueOf(b);
        String str2 = String.valueOf(c);
        System.out.println(str.matches("[01]+")); 
        System.out.println(str2.matches("[01]+")); 
    }
}
