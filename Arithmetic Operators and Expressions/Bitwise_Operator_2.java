package operators.and.expressions;

public class Bitwise_Operator_2 {
    public static void main(String[] args) {
        int x = 0b1000, a = -0b1010;
        int y,z,b,c;
        
        y = x << 2; // Left Shift
        z = x >> 1; // Right Shift
        b = a >> 1;
        c = ~x;
        
        System.out.println(y);
        System.out.println(z);
        System.out.println(b);
        System.out.println(String.format("%s",Integer.toBinaryString(a)));
        System.out.println(String.format("%s",Integer.toBinaryString(b)));
        System.out.println(String.format("%s", Integer.toBinaryString(c)));
        System.out.println(c);
        
    }
}
