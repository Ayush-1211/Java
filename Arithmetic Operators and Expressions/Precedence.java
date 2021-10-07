package operators.and.expressions;

public class Precedence {
    public static void main(String[] args) {
        // Precedence Priority:: - + * / %
        
        System.out.println(10+20/2);        //Wrong
        System.out.println((10+20)/2);      //Right
        
        System.out.println(10/2*5);         //Wrong
        System.out.println(10/(2*5));       //Right
    }
}
