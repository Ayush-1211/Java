package operators.and.expressions;
import java.util.*;

public class Cuboid {
    public static void main(String[] args) {
        int length,height,breadth;
        int area,volume;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Length:: ");
        length = sc.nextInt();
        System.out.println("Enter Height:: ");
        height = sc.nextInt();
        System.out.println("Enter Breadth:: ");
        breadth = sc.nextInt();
        
        area = 2*(length*breadth+length*height+breadth*height);
        
        volume = length*height*breadth;
        
        System.out.println("Total Area is:: " + area);
        System.out.println("Volume is:: " + volume);
        
    }
}
