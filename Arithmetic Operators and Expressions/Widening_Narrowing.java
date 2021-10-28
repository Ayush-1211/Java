// Widening (Up casting)
// Narrowing (Down casting)

package operators.and.expressions;
public class Widening_Narrowing {
    public static void main(String[] args) {
        byte b = 10;
        short s = 10;
        int i = 10;
        long l = 10;
        float f = 10.5f;
        double d = 10;
        char c = 10;
        boolean bl = true;
        
        s=b;        // Widening
        i=b;
        l=b;
        f=b;
        d=b;
        // c=b;         Not Possible
        c=(char)b;      //Narrowing (By using Narrowing we may loss value)
        System.out.println(c);
        // bl=b;        Not Possible
        
        i=(int)f;
        System.out.println(i);
    }
}
