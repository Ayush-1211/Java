package string.pkgclass.and.printing;
public class RE_Example_4 {
    public static void main(String[] args) {
        // Remove special characters from string
        String str = "a!B@c#1$2%3";
        
        System.out.println(str.replaceAll("[^a-zA-Z0-9]", "")); 
    }
}
