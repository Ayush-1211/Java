package string.pkgclass.and.printing;
public class String_Objects_2 {
    public static void main(String[] args) {
        String str1 = "Java";       // It will store in String Pool
        String str2 = "Java";
        String str3 = "java";
        String str4 = new String("Java");       // It will store in Heap
        
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);
    }
}
