package string.pkgclass.and.printing;
public class Formatted_Output_1 {
    public static void main(String[] args) {
        int x = 10;
        float y = 12.56f;
        char z = 'A';
        String str = "Java Program";
        
        System.out.printf("Hii\n");
        System.out.printf("Hello");
        
        System.out.printf("Hello %d %f %c World!!\n",x,y,z);    // %d = Decimal, %f = Float, %c = Character
        System.out.printf("%o %e\n",x,y);       // %o = Octal, %e = Exponential, %x = Hexadecimal
        
        System.out.printf("Hello %s\n",str);
        
        System.out.printf("%1$d %1$d %1$d\n",x,y);  // %1$d = %1 means first index, $d means decimal
        System.out.printf("%1$d %2$f %1$d\n",x,y);
        System.out.printf("%3$s %2$f %1$d\n",x,y,str);
    }
}
