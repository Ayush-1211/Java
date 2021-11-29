package methods;
public class Example_3 {
    // Overloaded method to calculate area
    static double area(double radius){
        return Math.PI*radius*radius;
    }
    static double area(double length, double breadth){
        return length*breadth;
    }
    public static void main(String[] args) {
        System.out.println("Area: " + area(2));
        System.out.println("Area: " + area(10,10));
    }
}
