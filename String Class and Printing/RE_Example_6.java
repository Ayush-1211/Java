package string.pkgclass.and.printing;
public class RE_Example_6 {
    public static void main(String[] args) {
        // Find number of words in a string
        String str = "    abc     de    fg    h    ";
        
        str = str.replaceAll("\\s+", " ").trim();
        String words[] = str.split("\\s");
        
        System.out.println(words.length);
    }
}
