package operators.and.expressions;
import java.util.*;

public class Quadratic_Equation {
    public static void main(String[] args) {
        int a,b,c;
        double r1,r2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Value of a:: ");
        a = sc.nextInt();
        System.out.println("Enter Value of b:: ");
        b = sc.nextInt();
        System.out.println("Enter Value of c:: ");
        c = sc.nextInt();
        
        r1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
        r2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
        
        System.out.println("Roots are " +r1+ " and " +r2);
    }
}
