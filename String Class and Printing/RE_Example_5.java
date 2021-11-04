package string.pkgclass.and.printing;

public class RE_Example_5 {
    public static void main(String[] args) {
        // Remove Extra spaces from a string
        String str = "    abc     de    fg    h    ";
        
        System.out.println(str.replaceAll("\\s+", " ").trim());
        
    }
}
