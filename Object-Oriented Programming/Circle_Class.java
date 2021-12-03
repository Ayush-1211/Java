package object.oriented.programming;
class circle{
    public double radius;
    public double area(){
        return Math.PI * radius * radius;
    }
    public double parimeter(){
        return 2 * Math.PI * radius;
    }
    public double circumference(){
        return parimeter();
    }
}
public class Circle_Class {
    
    public static void main(String[] args) {
        circle c1 = new circle();
        circle c2 = new circle();
        
        c1.radius = 7;
        c2.radius = 14;
        
        System.out.println("Area: "+c1.area());
        System.out.println("Parimeter: "+c1.parimeter());
        System.out.println("Circumference: "+c1.circumference());
        System.out.println("");
        System.out.println("Area2: "+c2.area());
        System.out.println("Parimeter2: "+c2.parimeter());
        System.out.println("Circumference2: "+c2.circumference());
    }
}
