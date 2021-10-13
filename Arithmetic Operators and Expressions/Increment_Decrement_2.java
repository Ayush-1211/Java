package operators.and.expressions;

public class Increment_Decrement_2 {
    public static void main(String[] args) {
        int x=5,y=4,z;
        
        z = 2*x++ + 3 * ++y;
        // z = 2*x++ + 3 * ++x      Answer:: 31
        
        System.out.println(z);
    }
}
