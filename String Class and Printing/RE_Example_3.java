package string.pkgclass.and.printing;
public class RE_Example_3 {
    public static void main(String[] args) {
        // Find is a data in Date format (dd/mm/yyyy)
        String date = "12/11/2000";
        
        System.out.println(date.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
    }
}
