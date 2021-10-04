public class Literals_2 {
    public static void main(String[] args) {
        
        long l = 999999999999L;
        float f = 12.56F;
        double d = 12.56;   //For double no need to write 'D' or 'd' 
        
        long l1 = 999_999_999L;     //Using _ we can separate digits for better understand
        float f1 = 123_456.56F;
        
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        
        System.out.println(l1);
        System.out.println(f1);
    }
}
