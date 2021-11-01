package string.pkgclass.and.printing;
public class String_Methods_3 {
    public static void main(String[] args) {
        String str1 = "JAVA";
        String str2 = "java";
        String str3 = "java";
        String str4 = "Python";
        String str5 = new String("java");
        String str6 = "India Gate";
        String str7 = "India gate";
        String str8 = "The great wall";
        String str9 = " of China";
        
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str2.equals(str5));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println("------------------------");
        
        System.out.println(str1==str2);
        System.out.println(str2==str3);
        System.out.println(str2==str5);
        System.out.println("------------------------");
        
        System.out.println(str2.compareTo(str3));   // Result is 0 because both strings are same
        System.out.println(str1.compareTo(str2));   // Result is negative because str1 is less than (According to ASCII values) str2 and 32 is differece between two strings
        System.out.println(str2.compareTo(str1));   // Result is positive because str2 is greater than str2
        System.out.println(str1.compareTo(str4));
        System.out.println(str6.compareTo(str7));
        System.out.println(str6.compareToIgnoreCase(str7));
        System.out.println("------------------------");
        
        System.out.println(str7.contains("gate"));
        System.out.println("------------------------");
        
        System.out.println(str8.concat(str9));
        System.out.println(str8 + str9);
    }
}
