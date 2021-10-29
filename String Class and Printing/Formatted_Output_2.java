package string.pkgclass.and.printing;
public class Formatted_Output_2 {
    public static void main(String[] args) {
        int a =10;
        int b = -10;
        float c = 123.45f;
        
        System.out.printf("%5d\n",a);     // Width - %5d means total width is 5
        System.out.printf("%05d\n",a);    // Flag  - %05d means empty space fill with 0
        
        System.out.printf("%(5d\n",b);    // If number is negetive then it will show value in brackets
        System.out.printf("%(5d\n",a);
        
        System.out.printf("%+5d\n",a);  // If number is positive then it will show "+" sign before value otherwise "-"
        System.out.printf("%+5d\n",b);
        
        System.out.printf("%6f\n",c);
        System.out.printf("%6.2f\n",c);
    }
}
