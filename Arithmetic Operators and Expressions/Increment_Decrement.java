package operators.and.expressions;

public class Increment_Decrement {
    public static void main(String[] args) {
        int x=5, y, a, b=5;
        char c = 'A';
        
        y = x++;    //Post Increment
        
        System.out.println("Value of Y is:: " + y);
        System.out.println("Value of X is:: " + x);
        
        a = ++b;    //Pre Increment
        
        System.out.println("Value of Y is:: " + a);
        System.out.println("Value of X is:: " + b);
        
        c++;
        System.out.println("Value of C is:: " + c);
    }
}
