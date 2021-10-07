package operators.and.expressions;
import java.util.*;

public class AreaOfTriangle_2 {
    public static void main(String[] args) {
        int a,b,c;
        float s;
        double area;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value a:: ");
        a = sc.nextInt();
        
        System.out.println("Enter Value b:: ");
        b = sc.nextInt();
        
        System.out.println("Enter Value c:: ");
        c = sc.nextInt();
        
        s = (a+b+c)/2f;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        System.out.println("Area of a Triangle is:: " + area);
    }
}
