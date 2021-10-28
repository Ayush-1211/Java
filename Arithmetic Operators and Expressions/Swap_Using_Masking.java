package operators.and.expressions;

public class Swap_Using_Masking {
    public static void main(String[] args) {
        int a=10, b=20;
        
        System.out.println("Value of a: "+a+" Value of b: "+b);
        
        a=a^b;
        b=a^b;
        a=a^b;
        
        System.out.println("Value of a: "+a+" Value of b: "+b);
    }
}
