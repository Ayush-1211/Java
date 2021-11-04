package string.pkgclass.and.printing;
public class RE_Example_2 {
    public static void main(String[] args) {
        // Find if a number is Hexadecimal or not
        String str = "234AB";
        String str2 = "B234AZ";
        
        System.out.println(str.matches("[0-9A-F]+"));
        System.out.println(str2.matches("[0-9A-F]+"));
    }
}
