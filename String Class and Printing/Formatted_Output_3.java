package string.pkgclass.and.printing;
public class Formatted_Output_3 {
    public static void main(String[] args) {
        float x = 3.45f;
        String str = "Java";
        
        System.out.printf("%20s\n",str);  
        System.out.printf("%-20s\n",str);
        
        System.out.format("%20s\n",str);    // Printf & Format both works same we can use any
    }
}
