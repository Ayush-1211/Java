package operators.and.expressions;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        float base, height, area;
        
        Scanner s = new Scanner(System.in);
        
        base = s.nextFloat();
        System.out.println("Base Value is:: " + base);
        
        height = s.nextFloat();
        System.out.println("Height Value is:: " + height);
        
        area = height * base / 2;
        
        System.out.println("Area of a Triangle is:: " + area);
    }
}
