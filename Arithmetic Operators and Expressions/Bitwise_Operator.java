package operators.and.expressions;

public class Bitwise_Operator {
    public static void main(String[] args) {
        int x=10,y=6,z,a,b;
        
        z = x & y;  // AND
        a = x | y;  // OR
        b = x ^ y;
        
        System.out.println(z);
        System.out.println(a);
        System.out.println(b);
    }
}
